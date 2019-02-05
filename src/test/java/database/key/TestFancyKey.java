package database.key;

import database.DataBase;
import database.record.Record;
import org.junit.Assert;
import org.junit.Test;
import poly.Cerc;

public class TestFancyKey {

    @Test
    public void testSuccessComparison(){
        Key myKey = new FancyKey(5);
        Key myOtherKey = new FancyKey(5);

        Assert.assertTrue(myKey.equals(myOtherKey));

        Key myBadKey = new FancyKey(6);
        Assert.assertFalse(myKey.equals(myBadKey));
    }

    @Test
    public void testDb(){
        DataBase db = new DataBase();
        Key key = new FancyKey(1);
        Key key2 = new FancyKey(3);
        Record cerc = new Cerc(key,10);
        Record expectedCerc = new Cerc(key2,10);
        db.insert(cerc);
        Record actualRecord = db.find(key);

        Assert.assertEquals(expectedCerc, actualRecord);
    }
}
