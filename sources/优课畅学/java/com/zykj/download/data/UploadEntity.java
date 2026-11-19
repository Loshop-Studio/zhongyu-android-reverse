package com.zykj.download.data;

import androidx.room.Entity;

@Entity(tableName = "upload")
/* loaded from: classes4.dex */
public final class UploadEntity {

    /* renamed from: a */
    public final int f9625a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadEntity) && this.f9625a == ((UploadEntity) obj).f9625a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f9625a);
    }

    public String toString() {
        return "UploadEntity(id=" + this.f9625a + ')';
    }
}
