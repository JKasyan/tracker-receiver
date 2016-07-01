package tracker.receiver.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import tracker.receiver.model.Point;

/**
 * Created by kasyan on 7/2/16.
 */

public interface PointRepository extends MongoRepository<Point, String> {}
