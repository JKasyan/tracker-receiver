package tracker.receiver.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import tracker.receiver.dao.PointRepository;
import tracker.receiver.model.Point;

/**
 * Created by kasyan on 7/2/16.
 */
@Controller
public class LocationController {

    private static final Logger LOGGER = Logger.getLogger(LocationController.class);

    @Autowired
    private PointRepository repository;

    @RequestMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public void fetchPoint(@RequestParam long id, @RequestParam long timestamp,
                           @RequestParam double lat, @RequestParam double lon,
                           @RequestParam double speed, @RequestParam double bearing,
                           @RequestParam double altitude, @RequestParam double batt){
        Point point = new Point();
        point.setId(String.valueOf(id));
        point.setTimestamp(timestamp);
        point.setLat(lat);
        point.setLon(lon);
        point.setSpeed(speed);
        point.setBearing(bearing);
        point.setAltitude(altitude);
        point.setBatt(batt);
        LOGGER.debug(point);
        repository.save(point);
    }
}
