package com.depth.app.data.local.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.depth.app.data.local.entity.DepthPointEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DepthDao_Impl implements DepthDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DepthPointEntity> __insertionAdapterOfDepthPointEntity;

  public DepthDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDepthPointEntity = new EntityInsertionAdapter<DepthPointEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `depth_points` (`id`,`lakeId`,`latitude`,`longitude`,`depth`,`authorId`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DepthPointEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getLakeId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getLakeId());
        }
        statement.bindDouble(3, entity.getLatitude());
        statement.bindDouble(4, entity.getLongitude());
        statement.bindDouble(5, entity.getDepth());
        statement.bindLong(6, entity.getAuthorId());
        statement.bindLong(7, entity.getCreatedAt());
      }
    };
  }

  @Override
  public Object insertDepth(final DepthPointEntity point,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDepthPointEntity.insert(point);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<DepthPointEntity>> getDepthsForLake(final Long lakeId) {
    final String _sql = "SELECT * FROM depth_points WHERE lakeId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (lakeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, lakeId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"depth_points"}, new Callable<List<DepthPointEntity>>() {
      @Override
      @NonNull
      public List<DepthPointEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLakeId = CursorUtil.getColumnIndexOrThrow(_cursor, "lakeId");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfDepth = CursorUtil.getColumnIndexOrThrow(_cursor, "depth");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "authorId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<DepthPointEntity> _result = new ArrayList<DepthPointEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DepthPointEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final Long _tmpLakeId;
            if (_cursor.isNull(_cursorIndexOfLakeId)) {
              _tmpLakeId = null;
            } else {
              _tmpLakeId = _cursor.getLong(_cursorIndexOfLakeId);
            }
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final float _tmpDepth;
            _tmpDepth = _cursor.getFloat(_cursorIndexOfDepth);
            final long _tmpAuthorId;
            _tmpAuthorId = _cursor.getLong(_cursorIndexOfAuthorId);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new DepthPointEntity(_tmpId,_tmpLakeId,_tmpLatitude,_tmpLongitude,_tmpDepth,_tmpAuthorId,_tmpCreatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
