package io.spring.simplecache.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
    @Table(name="ticket")
    public class Ticket implements Serializable {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        @Column(name="ticket_id")
        private Integer ticketId;

        @Column(name="passenger_name",nullable=false)
        private String passengerName;

        @Column(name="source_station",nullable=false)
        private String sourceStation;

        @Column(name="dest_station",nullable=false)
        private String destStation;

        @Column(name="email")
        private String email;

        public Ticket() {
        }

        public Ticket( String passengerName, String sourceStation, String destStation, String email) {
            this.passengerName = passengerName;
            this.sourceStation = sourceStation;
            this.destStation = destStation;
            this.email = email;
        }

        public Integer getTicketId() {
            return ticketId;
        }
        public void setTicketId(Integer ticketId) {
            this.ticketId = ticketId;
        }
        public String getPassengerName() {
            return passengerName;
        }
        public void setPassengerName(String passengerName) {
            this.passengerName = passengerName;
        }

        public String getSourceStation() {
            return sourceStation;
        }
        public void setSourceStation(String sourceStation) {
            this.sourceStation = sourceStation;
        }
        public String getDestStation() {
            return destStation;
        }
        public void setDestStation(String destStation) {
            this.destStation = destStation;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
        @Override
        public String toString() {
            return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName
                    + ", sourceStation=" + sourceStation + ", destStation=" + destStation + ", email=" + email + "]";
        }

}
