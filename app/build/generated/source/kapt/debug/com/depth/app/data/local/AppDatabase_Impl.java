package com.depth.app.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.depth.app.data.local.dao.DepthDao;
import com.depth.app.data.local.dao.DepthDao_Impl;
import com.depth.app.data.local.dao.FishingSpotDao;
import com.depth.app.data.local.dao.FishingSpotDao_Impl;
import com.depth.app.data.local.dao.SubscriptionDao;
import com.depth.app.data.local.dao.SubscriptionDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile FishingSpotDao _fishingSpotDao;

  private volatile DepthDao _depthDao;

  private volatile SubscriptionDao _subscriptionDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `fishing_spots` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `description` TEXT, `createdAt` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `depth_points` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `lakeId` INTEGER, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `depth` REAL NOT NULL, `authorId` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `subscriptions` (`followerId` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, PRIMARY KEY(`followerId`, `targetId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cd2d4a566a6f3c80c4bca217f98516ce')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `fishing_spots`");
        db.execSQL("DROP TABLE IF EXISTS `depth_points`");
        db.execSQL("DROP TABLE IF EXISTS `subscriptions`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsFishingSpots = new HashMap<String, TableInfo.Column>(6);
        _columnsFishingSpots.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFishingSpots.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFishingSpots.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFishingSpots.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFishingSpots.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFishingSpots.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFishingSpots = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFishingSpots = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFishingSpots = new TableInfo("fishing_spots", _columnsFishingSpots, _foreignKeysFishingSpots, _indicesFishingSpots);
        final TableInfo _existingFishingSpots = TableInfo.read(db, "fishing_spots");
        if (!_infoFishingSpots.equals(_existingFishingSpots)) {
          return new RoomOpenHelper.ValidationResult(false, "fishing_spots(com.depth.app.data.local.entity.FishingSpotEntity).\n"
                  + " Expected:\n" + _infoFishingSpots + "\n"
                  + " Found:\n" + _existingFishingSpots);
        }
        final HashMap<String, TableInfo.Column> _columnsDepthPoints = new HashMap<String, TableInfo.Column>(7);
        _columnsDepthPoints.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDepthPoints.put("lakeId", new TableInfo.Column("lakeId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDepthPoints.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDepthPoints.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDepthPoints.put("depth", new TableInfo.Column("depth", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDepthPoints.put("authorId", new TableInfo.Column("authorId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDepthPoints.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDepthPoints = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDepthPoints = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDepthPoints = new TableInfo("depth_points", _columnsDepthPoints, _foreignKeysDepthPoints, _indicesDepthPoints);
        final TableInfo _existingDepthPoints = TableInfo.read(db, "depth_points");
        if (!_infoDepthPoints.equals(_existingDepthPoints)) {
          return new RoomOpenHelper.ValidationResult(false, "depth_points(com.depth.app.data.local.entity.DepthPointEntity).\n"
                  + " Expected:\n" + _infoDepthPoints + "\n"
                  + " Found:\n" + _existingDepthPoints);
        }
        final HashMap<String, TableInfo.Column> _columnsSubscriptions = new HashMap<String, TableInfo.Column>(2);
        _columnsSubscriptions.put("followerId", new TableInfo.Column("followerId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptions.put("targetId", new TableInfo.Column("targetId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubscriptions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubscriptions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubscriptions = new TableInfo("subscriptions", _columnsSubscriptions, _foreignKeysSubscriptions, _indicesSubscriptions);
        final TableInfo _existingSubscriptions = TableInfo.read(db, "subscriptions");
        if (!_infoSubscriptions.equals(_existingSubscriptions)) {
          return new RoomOpenHelper.ValidationResult(false, "subscriptions(com.depth.app.data.local.entity.SubscriptionEntity).\n"
                  + " Expected:\n" + _infoSubscriptions + "\n"
                  + " Found:\n" + _existingSubscriptions);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "cd2d4a566a6f3c80c4bca217f98516ce", "d71244fe0cde937a892d17054624bc38");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "fishing_spots","depth_points","subscriptions");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `fishing_spots`");
      _db.execSQL("DELETE FROM `depth_points`");
      _db.execSQL("DELETE FROM `subscriptions`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FishingSpotDao.class, FishingSpotDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DepthDao.class, DepthDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SubscriptionDao.class, SubscriptionDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public FishingSpotDao fishingSpotDao() {
    if (_fishingSpotDao != null) {
      return _fishingSpotDao;
    } else {
      synchronized(this) {
        if(_fishingSpotDao == null) {
          _fishingSpotDao = new FishingSpotDao_Impl(this);
        }
        return _fishingSpotDao;
      }
    }
  }

  @Override
  public DepthDao depthDao() {
    if (_depthDao != null) {
      return _depthDao;
    } else {
      synchronized(this) {
        if(_depthDao == null) {
          _depthDao = new DepthDao_Impl(this);
        }
        return _depthDao;
      }
    }
  }

  @Override
  public SubscriptionDao subscriptionDao() {
    if (_subscriptionDao != null) {
      return _subscriptionDao;
    } else {
      synchronized(this) {
        if(_subscriptionDao == null) {
          _subscriptionDao = new SubscriptionDao_Impl(this);
        }
        return _subscriptionDao;
      }
    }
  }
}
