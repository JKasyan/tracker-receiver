package tracker.receiver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by kasyan on 7/2/16.
 */
@Document(collection = "Point")
public class Point {

    @Id
    private String _id;
    private String id;
    private long timestamp;
    private double lat;
    private double lng;
    private double speed;
    private double bearing;
    private double altitude;
    private double batt;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getBearing() {
        return bearing;
    }

    public void setBearing(double bearing) {
        this.bearing = bearing;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getBatt() {
        return batt;
    }

    public void setBatt(double batt) {
        this.batt = batt;
    }

    @Override
    public String toString() {
        return "Point{" +
                "_id='" + _id + '\'' +
                ", id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", lat=" + lat +
                ", lng=" + lng +
                ", speed=" + speed +
                ", bearing=" + bearing +
                ", altitude=" + altitude +
                ", batt=" + batt +
                '}';
    }
}
