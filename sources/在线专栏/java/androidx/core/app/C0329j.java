package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0332a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.j */
/* loaded from: classes.dex */
public final class C0329j implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f2662a = new ArrayList<>();

    /* renamed from: b */
    private final Context f2663b;

    /* renamed from: androidx.core.app.j$a */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private C0329j(Context context) {
        this.f2663b = context;
    }

    /* renamed from: d */
    public static C0329j m1787d(Context context) {
        return new C0329j(context);
    }

    /* renamed from: a */
    public C0329j m1788a(Intent intent) {
        this.f2662a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public C0329j m1789b(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0325f.m1779a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2663b.getPackageManager());
            }
            m1790c(component);
            m1788a(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: c */
    public C0329j m1790c(ComponentName componentName) {
        int size = this.f2662a.size();
        try {
            Intent intentM1780b = C0325f.m1780b(this.f2663b, componentName);
            while (intentM1780b != null) {
                this.f2662a.add(size, intentM1780b);
                intentM1780b = C0325f.m1780b(this.f2663b, intentM1780b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e4);
        }
    }

    /* renamed from: e */
    public void m1791e() {
        m1792f(null);
    }

    /* renamed from: f */
    public void m1792f(Bundle bundle) {
        if (this.f2662a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f2662a;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0332a.m1809g(this.f2663b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f2663b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2662a.iterator();
    }
}
