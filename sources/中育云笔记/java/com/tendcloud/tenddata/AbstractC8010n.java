package com.tendcloud.tenddata;

import android.R;
import android.content.Context;
import android.util.SparseArray;
import anet.channel.strategy.dispatch.DispatchConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tendcloud.tenddata.n */
/* loaded from: classes5.dex */
abstract class AbstractC8010n {
    private static final String LOGTAG = "TD.ResReader";
    private final Context mContext;
    private final Map<String, Integer> mIdNameToId;
    private final SparseArray<String> mIdToIdName;

    /* renamed from: com.tendcloud.tenddata.n$a */
    public static class a extends AbstractC8010n {
        private final String mResourcePackageName;

        public a(String str, Context context) {
            super(context);
            this.mResourcePackageName = str;
            initialize();
        }

        @Override // com.tendcloud.tenddata.AbstractC8010n
        public String getLocalClassName(Context context) {
            return this.mResourcePackageName + ".R$drawable";
        }

        @Override // com.tendcloud.tenddata.AbstractC8010n
        public Class<?> getSystemClass() {
            return R.drawable.class;
        }
    }

    /* renamed from: com.tendcloud.tenddata.n$b */
    public static class b extends AbstractC8010n {
        private final String mResourcePackageName;

        public b(String str, Context context) {
            super(context);
            this.mResourcePackageName = str;
            initialize();
        }

        @Override // com.tendcloud.tenddata.AbstractC8010n
        public String getLocalClassName(Context context) {
            return this.mResourcePackageName + ".R$id";
        }

        @Override // com.tendcloud.tenddata.AbstractC8010n
        public Class<?> getSystemClass() {
            return R.id.class;
        }
    }

    private static void readClassIds(Class<?> cls, String str, Map<String, Integer> map) {
        try {
            for (Field field : cls.getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Integer.TYPE) {
                    String name = field.getName();
                    int i10 = field.getInt(null);
                    if (str != null) {
                        name = str + ":" + name;
                    }
                    map.put(name, Integer.valueOf(i10));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public abstract String getLocalClassName(Context context);

    public abstract Class<?> getSystemClass();

    public int idFromName(String str) {
        return this.mIdNameToId.get(str).intValue();
    }

    public void initialize() {
        this.mIdNameToId.clear();
        this.mIdToIdName.clear();
        readClassIds(getSystemClass(), DispatchConstants.ANDROID, this.mIdNameToId);
        String localClassName = getLocalClassName(this.mContext);
        try {
            readClassIds(Class.forName(localClassName), null, this.mIdNameToId);
        } catch (ClassNotFoundException unused) {
            C7896ca.eForInternal(LOGTAG, "Class not found from '" + localClassName);
        }
        for (Map.Entry<String, Integer> entry : this.mIdNameToId.entrySet()) {
            this.mIdToIdName.put(entry.getValue().intValue(), entry.getKey());
        }
    }

    public boolean knownIdName(String str) {
        return this.mIdNameToId.containsKey(str);
    }

    public String nameForId(int i10) {
        return this.mIdToIdName.get(i10);
    }

    private AbstractC8010n(Context context) {
        this.mContext = context;
        this.mIdNameToId = new HashMap();
        this.mIdToIdName = new SparseArray<>();
    }
}
