package com.johnhunsley.webflux;


import java.util.Objects;

public class Event {
    private String eventId;
    private String eventDt;

    public Event(String eventId, String eventDt) {
        this.eventId = eventId;
        this.eventDt = eventDt;
    }

    public Event() {}

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventDt() {
        return eventDt;
    }

    public void setEventDt(String eventDt) {
        this.eventDt = eventDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventId, event.eventId) &&
                Objects.equals(eventDt, event.eventDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventDt);
    }
}
