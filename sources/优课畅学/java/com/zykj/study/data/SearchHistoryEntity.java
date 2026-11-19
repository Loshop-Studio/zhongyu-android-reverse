package com.zykj.study.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@Entity(tableName = "search_history")
/* loaded from: classes3.dex */
public final class SearchHistoryEntity {
    public static final int $stable = 8;
    private final Date createDate;

    /* renamed from: id */
    @PrimaryKey(autoGenerate = true)
    private final int f11023id;
    private final String searchKey;
    private final String userId;

    public SearchHistoryEntity(int i10, String userId, String searchKey, Date createDate) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(searchKey, "searchKey");
        AbstractC9133u.m16133g(createDate, "createDate");
        this.f11023id = i10;
        this.userId = userId;
        this.searchKey = searchKey;
        this.createDate = createDate;
    }

    public static /* synthetic */ SearchHistoryEntity copy$default(SearchHistoryEntity searchHistoryEntity, int i10, String str, String str2, Date date, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = searchHistoryEntity.f11023id;
        }
        if ((i11 & 2) != 0) {
            str = searchHistoryEntity.userId;
        }
        if ((i11 & 4) != 0) {
            str2 = searchHistoryEntity.searchKey;
        }
        if ((i11 & 8) != 0) {
            date = searchHistoryEntity.createDate;
        }
        return searchHistoryEntity.copy(i10, str, str2, date);
    }

    public final int component1() {
        return this.f11023id;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.searchKey;
    }

    public final Date component4() {
        return this.createDate;
    }

    public final SearchHistoryEntity copy(int i10, String userId, String searchKey, Date createDate) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(searchKey, "searchKey");
        AbstractC9133u.m16133g(createDate, "createDate");
        return new SearchHistoryEntity(i10, userId, searchKey, createDate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHistoryEntity)) {
            return false;
        }
        SearchHistoryEntity searchHistoryEntity = (SearchHistoryEntity) obj;
        return this.f11023id == searchHistoryEntity.f11023id && AbstractC9133u.m16128b(this.userId, searchHistoryEntity.userId) && AbstractC9133u.m16128b(this.searchKey, searchHistoryEntity.searchKey) && AbstractC9133u.m16128b(this.createDate, searchHistoryEntity.createDate);
    }

    public final Date getCreateDate() {
        return this.createDate;
    }

    public final int getId() {
        return this.f11023id;
    }

    public final String getSearchKey() {
        return this.searchKey;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f11023id) * 31) + this.userId.hashCode()) * 31) + this.searchKey.hashCode()) * 31) + this.createDate.hashCode();
    }

    public String toString() {
        return "SearchHistoryEntity(id=" + this.f11023id + ", userId=" + this.userId + ", searchKey=" + this.searchKey + ", createDate=" + this.createDate + ")";
    }
}
