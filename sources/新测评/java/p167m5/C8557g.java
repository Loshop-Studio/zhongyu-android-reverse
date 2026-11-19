package p167m5;

import android.content.Context;
import androidx.room.Room;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p056di.AppDatabaseKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m5.g */
/* loaded from: classes4.dex */
public final class C8557g {

    /* renamed from: a */
    public static final C8557g f14193a = new C8557g();

    /* renamed from: a */
    public final AppDatabase m14099a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (AppDatabase) Room.databaseBuilder(context, AppDatabase.class, "NewEvaluationDatabase").addMigrations(AppDatabaseKt.m8679a()).build();
    }
}
