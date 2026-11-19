package com.zykj.sketch.permission;

import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;

/* loaded from: classes5.dex */
public class Permission {
    public final boolean granted;
    public final String name;
    public final boolean shouldShowRequestPermissionRationale;

    public Permission(String str, boolean z9) {
        this(str, z9, false);
    }

    private Boolean combineGranted(List<Permission> list) {
        return Observable.fromIterable(list).all(new Predicate<Permission>() { // from class: com.zykj.sketch.permission.Permission.3
            @Override // io.reactivex.functions.Predicate
            public boolean test(Permission permission) throws Exception {
                return permission.granted;
            }
        }).blockingGet();
    }

    private String combineName(List<Permission> list) {
        return ((StringBuilder) Observable.fromIterable(list).map(new Function<Permission, String>() { // from class: com.zykj.sketch.permission.Permission.2
            @Override // io.reactivex.functions.Function
            public String apply(Permission permission) throws Exception {
                return permission.name;
            }
        }).collectInto(new StringBuilder(), new BiConsumer<StringBuilder, String>() { // from class: com.zykj.sketch.permission.Permission.1
            @Override // io.reactivex.functions.BiConsumer
            public void accept(StringBuilder sb, String str) throws Exception {
                if (sb.length() == 0) {
                    sb.append(str);
                } else {
                    sb.append(", ");
                    sb.append(str);
                }
            }
        }).blockingGet()).toString();
    }

    private Boolean combineShouldShowRequestPermissionRationale(List<Permission> list) {
        return Observable.fromIterable(list).any(new Predicate<Permission>() { // from class: com.zykj.sketch.permission.Permission.4
            @Override // io.reactivex.functions.Predicate
            public boolean test(Permission permission) throws Exception {
                return permission.shouldShowRequestPermissionRationale;
            }
        }).blockingGet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Permission permission = (Permission) obj;
        if (this.granted == permission.granted && this.shouldShowRequestPermissionRationale == permission.shouldShowRequestPermissionRationale) {
            return this.name.equals(permission.name);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + (this.granted ? 1 : 0)) * 31) + (this.shouldShowRequestPermissionRationale ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.name + "', granted=" + this.granted + ", shouldShowRequestPermissionRationale=" + this.shouldShowRequestPermissionRationale + '}';
    }

    public Permission(String str, boolean z9, boolean z10) {
        this.name = str;
        this.granted = z9;
        this.shouldShowRequestPermissionRationale = z10;
    }

    public Permission(List<Permission> list) {
        this.name = combineName(list);
        this.granted = combineGranted(list).booleanValue();
        this.shouldShowRequestPermissionRationale = combineShouldShowRequestPermissionRationale(list).booleanValue();
    }
}
