package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends DataBinderMapper {
    private static final String TAG = "MergedDataBinderMapper";
    private Set<Class<? extends DataBinderMapper>> mExistingMappers = new HashSet();
    private List<DataBinderMapper> mMappers = new CopyOnWriteArrayList();
    private List<String> mFeatureBindingMappers = new CopyOnWriteArrayList();

    private boolean loadFeatures() throws ClassNotFoundException {
        boolean z3 = false;
        for (String str : this.mFeatureBindingMappers) {
            try {
                Class<?> cls = Class.forName(str);
                if (DataBinderMapper.class.isAssignableFrom(cls)) {
                    addMapper((DataBinderMapper) cls.newInstance());
                    this.mFeatureBindingMappers.remove(str);
                    z3 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e4) {
                Log.e(TAG, "unable to add feature mapper for " + str, e4);
            } catch (InstantiationException e5) {
                Log.e(TAG, "unable to add feature mapper for " + str, e5);
            }
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addMapper(DataBinderMapper dataBinderMapper) {
        if (this.mExistingMappers.add(dataBinderMapper.getClass())) {
            this.mMappers.add(dataBinderMapper);
            Iterator<DataBinderMapper> it = dataBinderMapper.collectDependencies().iterator();
            while (it.hasNext()) {
                addMapper(it.next());
            }
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i4) {
        Iterator<DataBinderMapper> it = this.mMappers.iterator();
        while (it.hasNext()) {
            String strConvertBrIdToString = it.next().convertBrIdToString(i4);
            if (strConvertBrIdToString != null) {
                return strConvertBrIdToString;
            }
        }
        if (loadFeatures()) {
            return convertBrIdToString(i4);
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i4) {
        Iterator<DataBinderMapper> it = this.mMappers.iterator();
        while (it.hasNext()) {
            ViewDataBinding dataBinder = it.next().getDataBinder(dataBindingComponent, view, i4);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (loadFeatures()) {
            return getDataBinder(dataBindingComponent, view, i4);
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Iterator<DataBinderMapper> it = this.mMappers.iterator();
        while (it.hasNext()) {
            int layoutId = it.next().getLayoutId(str);
            if (layoutId != 0) {
                return layoutId;
            }
        }
        if (loadFeatures()) {
            return getLayoutId(str);
        }
        return 0;
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i4) {
        Iterator<DataBinderMapper> it = this.mMappers.iterator();
        while (it.hasNext()) {
            ViewDataBinding dataBinder = it.next().getDataBinder(dataBindingComponent, viewArr, i4);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (loadFeatures()) {
            return getDataBinder(dataBindingComponent, viewArr, i4);
        }
        return null;
    }

    public void addMapper(String str) {
        this.mFeatureBindingMappers.add(str + ".DataBinderMapperImpl");
    }
}
