package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
class ResourcesWrapper extends Resources {
    private final Resources mResources;

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i6) {
        return this.mResources.getAnimation(i6);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i6) {
        return this.mResources.getBoolean(i6);
    }

    @Override // android.content.res.Resources
    public int getColor(int i6) {
        return this.mResources.getColor(i6);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i6) {
        return this.mResources.getColorStateList(i6);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i6) {
        return this.mResources.getDimension(i6);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i6) {
        return this.mResources.getDimensionPixelOffset(i6);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i6) {
        return this.mResources.getDimensionPixelSize(i6);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i6) {
        return this.mResources.getDrawable(i6);
    }

    public final Drawable getDrawableCanonical(int i6) {
        return super.getDrawable(i6);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i6, int i7) {
        return ResourcesCompat.getDrawableForDensity(this.mResources, i6, i7, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i6, int i7, int i8) {
        return this.mResources.getFraction(i6, i7, i8);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i6) {
        return this.mResources.getIntArray(i6);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i6) {
        return this.mResources.getInteger(i6);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i6) {
        return this.mResources.getLayout(i6);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i6) {
        return this.mResources.getMovie(i6);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i6, int i7, Object... objArr) {
        return this.mResources.getQuantityString(i6, i7, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i6, int i7) {
        return this.mResources.getQuantityText(i6, i7);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i6) {
        return this.mResources.getResourceEntryName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i6) {
        return this.mResources.getResourceName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i6) {
        return this.mResources.getResourcePackageName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i6) {
        return this.mResources.getResourceTypeName(i6);
    }

    @Override // android.content.res.Resources
    public String getString(int i6) {
        return this.mResources.getString(i6);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i6) {
        return this.mResources.getStringArray(i6);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i6) {
        return this.mResources.getText(i6);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i6) {
        return this.mResources.getTextArray(i6);
    }

    @Override // android.content.res.Resources
    public void getValue(int i6, TypedValue typedValue, boolean z6) throws Resources.NotFoundException {
        this.mResources.getValue(i6, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i6, int i7, TypedValue typedValue, boolean z6) throws Resources.NotFoundException {
        this.mResources.getValueForDensity(i6, i7, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i6) {
        return this.mResources.getXml(i6);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i6) {
        return this.mResources.obtainTypedArray(i6);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i6) {
        return this.mResources.openRawResource(i6);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i6) {
        return this.mResources.openRawResourceFd(i6);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.mResources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawable(int i6, Resources.Theme theme) {
        return ResourcesCompat.getDrawable(this.mResources, i6, theme);
    }

    @Override // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawableForDensity(int i6, int i7, Resources.Theme theme) {
        return ResourcesCompat.getDrawableForDensity(this.mResources, i6, i7, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i6, int i7) {
        return this.mResources.getQuantityString(i6, i7);
    }

    @Override // android.content.res.Resources
    public String getString(int i6, Object... objArr) {
        return this.mResources.getString(i6, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i6, CharSequence charSequence) {
        return this.mResources.getText(i6, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z6) throws Resources.NotFoundException {
        this.mResources.getValue(str, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i6, TypedValue typedValue) {
        return this.mResources.openRawResource(i6, typedValue);
    }
}
