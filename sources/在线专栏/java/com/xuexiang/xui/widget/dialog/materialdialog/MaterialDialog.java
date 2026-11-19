package com.xuexiang.xui.widget.dialog.materialdialog;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.IBinder;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.StatusBarUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.dialog.materialdialog.DefaultRvAdapter;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDTintHelper;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.ThemeSingleton;
import com.xuexiang.xui.widget.dialog.materialdialog.util.RippleHelper;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class MaterialDialog extends DialogBase implements View.OnClickListener, DefaultRvAdapter.InternalListCallback {
    final Builder builder;
    CheckBox checkBoxPrompt;
    protected TextView content;
    FrameLayout customViewFrame;
    private final Handler handler;
    protected ImageView icon;
    EditText input;
    TextView inputMinMax;
    ListType listType;
    MDButton negativeButton;
    MDButton neutralButton;
    MDButton positiveButton;
    ProgressBar progressBar;
    TextView progressLabel;
    TextView progressMinMax;
    RecyclerView recyclerView;
    List<Integer> selectedIndicesList;
    protected TextView title;
    View titleFrame;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$6 */
    static /* synthetic */ class C21346 {

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$dialog$materialdialog$DialogAction */
        static final /* synthetic */ int[] f9686x9cd0d1bf;

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$dialog$materialdialog$MaterialDialog$ListType */
        static final /* synthetic */ int[] f9687x106dfa0c;

        static {
            int[] iArr = new int[ListType.values().length];
            f9687x106dfa0c = iArr;
            try {
                iArr[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9687x106dfa0c[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9687x106dfa0c[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DialogAction.values().length];
            f9686x9cd0d1bf = iArr2;
            try {
                iArr2[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9686x9cd0d1bf[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9686x9cd0d1bf[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class Builder {
        protected RecyclerView.AbstractC0562g<?> adapter;
        protected boolean alwaysCallInputCallback;
        protected boolean alwaysCallMultiChoiceCallback;
        protected boolean alwaysCallSingleChoiceCallback;
        protected boolean autoDismiss;
        protected int backgroundColor;
        protected int btnSelectorNegative;
        protected int btnSelectorNeutral;
        protected int btnSelectorPositive;
        protected int btnSelectorStacked;
        protected GravityEnum btnStackedGravity;
        protected int buttonRippleColor;
        protected GravityEnum buttonsGravity;
        protected ButtonCallback callback;
        protected DialogInterface.OnCancelListener cancelListener;
        protected boolean cancelable;
        protected boolean canceledOnTouchOutside;
        protected CharSequence checkBoxPrompt;
        protected boolean checkBoxPromptInitiallyChecked;
        protected CompoundButton.OnCheckedChangeListener checkBoxPromptListener;
        protected ColorStateList choiceWidgetColor;
        protected CharSequence content;
        protected int contentColor;
        protected boolean contentColorSet;
        protected GravityEnum contentGravity;
        protected float contentLineSpacingMultiplier;
        protected final Context context;
        protected int customTheme;
        protected View customView;
        protected Integer[] disabledIndices;
        protected DialogInterface.OnDismissListener dismissListener;
        protected int dividerColor;
        protected boolean dividerColorSet;
        protected Drawable icon;
        protected boolean indeterminateIsHorizontalProgress;
        protected boolean indeterminateProgress;
        protected boolean inputAllowEmpty;
        protected InputCallback inputCallback;
        protected CharSequence inputHint;
        protected int inputMaxLength;
        protected int inputMinLength;
        protected CharSequence inputPrefill;
        protected int inputRangeErrorColor;
        protected int inputType;
        protected boolean isFullScreen;
        protected int itemColor;
        protected boolean itemColorSet;
        protected int[] itemIds;
        protected ArrayList<CharSequence> items;
        protected GravityEnum itemsGravity;
        protected DialogInterface.OnKeyListener keyListener;
        protected RecyclerView.AbstractC0570o layoutManager;
        protected boolean limitIconToDefaultSize;
        protected ColorStateList linkColor;
        protected ListCallback listCallback;
        protected ListCallbackMultiChoice listCallbackMultiChoice;
        protected ListCallbackSingleChoice listCallbackSingleChoice;
        protected ListLongCallback listLongCallback;
        protected int listSelector;
        protected int maxIconSize;
        protected Typeface mediumFont;
        protected ColorStateList negativeColor;
        protected boolean negativeColorSet;
        protected boolean negativeFocus;
        protected CharSequence negativeText;
        protected ColorStateList neutralColor;
        protected boolean neutralColorSet;
        protected boolean neutralFocus;
        protected CharSequence neutralText;
        protected SingleButtonCallback onAnyCallback;
        protected SingleButtonCallback onNegativeCallback;
        protected SingleButtonCallback onNeutralCallback;
        protected SingleButtonCallback onPositiveCallback;
        protected ColorStateList positiveColor;
        protected boolean positiveColorSet;
        protected boolean positiveFocus;
        protected CharSequence positiveText;
        protected int progress;
        protected int progressMax;
        protected String progressNumberFormat;
        protected NumberFormat progressPercentFormat;
        protected Typeface regularFont;
        protected int selectedIndex;
        protected Integer[] selectedIndices;
        protected DialogInterface.OnShowListener showListener;
        protected boolean showMinMax;
        protected StackingBehavior stackingBehavior;
        protected Object tag;
        protected Theme theme;
        protected CharSequence title;
        protected int titleColor;
        protected boolean titleColorSet;
        protected GravityEnum titleGravity;
        protected int widgetColor;
        protected boolean widgetColorSet;
        protected boolean wrapCustomViewInScroll;

        public Builder(Context context) {
            GravityEnum gravityEnum = GravityEnum.START;
            this.titleGravity = gravityEnum;
            this.contentGravity = gravityEnum;
            this.btnStackedGravity = GravityEnum.END;
            this.itemsGravity = gravityEnum;
            this.buttonsGravity = gravityEnum;
            this.buttonRippleColor = 0;
            this.titleColor = -1;
            this.contentColor = -1;
            this.alwaysCallMultiChoiceCallback = false;
            this.alwaysCallSingleChoiceCallback = false;
            Theme theme = Theme.LIGHT;
            this.theme = theme;
            this.customTheme = -1;
            this.cancelable = true;
            this.canceledOnTouchOutside = true;
            this.contentLineSpacingMultiplier = 1.2f;
            this.selectedIndex = -1;
            this.selectedIndices = null;
            this.disabledIndices = null;
            this.autoDismiss = true;
            this.maxIconSize = -1;
            this.progress = -2;
            this.progressMax = 0;
            this.inputType = -1;
            this.inputMinLength = -1;
            this.inputMaxLength = -1;
            this.inputRangeErrorColor = 0;
            this.titleColorSet = false;
            this.contentColorSet = false;
            this.itemColorSet = false;
            this.positiveColorSet = false;
            this.neutralColorSet = false;
            this.negativeColorSet = false;
            this.widgetColorSet = false;
            this.dividerColorSet = false;
            this.context = context;
            int iResolveColor = ThemeUtils.resolveColor(context, C2042R.attr.colorAccent, ThemeUtils.getColor(context, C2042R.color.md_material_blue_600));
            this.widgetColor = iResolveColor;
            int iResolveColor2 = ThemeUtils.resolveColor(context, R.attr.colorAccent, iResolveColor);
            this.widgetColor = iResolveColor2;
            this.positiveColor = ThemeUtils.getActionTextStateList(context, iResolveColor2);
            this.negativeColor = ThemeUtils.getActionTextStateList(context, this.widgetColor);
            this.neutralColor = ThemeUtils.getActionTextStateList(context, this.widgetColor);
            this.linkColor = ThemeUtils.getActionTextStateList(context, ThemeUtils.resolveColor(context, C2042R.attr.md_link_color, this.widgetColor));
            this.buttonRippleColor = ThemeUtils.resolveColor(context, C2042R.attr.md_btn_ripple_color, ThemeUtils.resolveColor(context, C2042R.attr.colorControlHighlight, ThemeUtils.resolveColor(context, R.attr.colorControlHighlight)));
            this.progressPercentFormat = NumberFormat.getPercentInstance();
            this.progressNumberFormat = "%1d/%2d";
            this.theme = ThemeUtils.isColorDark(ThemeUtils.resolveColor(context, R.attr.textColorPrimary)) ? theme : Theme.DARK;
            checkSingleton();
            this.titleGravity = ThemeUtils.resolveGravityEnum(context, C2042R.attr.md_title_gravity, this.titleGravity);
            this.contentGravity = ThemeUtils.resolveGravityEnum(context, C2042R.attr.md_content_gravity, this.contentGravity);
            this.btnStackedGravity = ThemeUtils.resolveGravityEnum(context, C2042R.attr.md_btnstacked_gravity, this.btnStackedGravity);
            this.itemsGravity = ThemeUtils.resolveGravityEnum(context, C2042R.attr.md_items_gravity, this.itemsGravity);
            this.buttonsGravity = ThemeUtils.resolveGravityEnum(context, C2042R.attr.md_buttons_gravity, this.buttonsGravity);
            try {
                typeface(ThemeUtils.resolveString(context, C2042R.attr.md_medium_font, XUI.getDefaultFontAssetPath()), ThemeUtils.resolveString(context, C2042R.attr.md_regular_font, XUI.getDefaultFontAssetPath()));
            } catch (Throwable unused) {
            }
            if (this.mediumFont == null) {
                try {
                    this.mediumFont = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.mediumFont = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.regularFont == null) {
                try {
                    this.regularFont = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.regularFont = typeface;
                    if (typeface == null) {
                        this.regularFont = Typeface.DEFAULT;
                    }
                }
            }
        }

        private void checkSingleton() {
            if (ThemeSingleton.get(false) == null) {
                return;
            }
            ThemeSingleton themeSingleton = ThemeSingleton.get();
            if (themeSingleton.darkTheme) {
                this.theme = Theme.DARK;
            }
            int i4 = themeSingleton.titleColor;
            if (i4 != 0) {
                this.titleColor = i4;
            }
            int i5 = themeSingleton.contentColor;
            if (i5 != 0) {
                this.contentColor = i5;
            }
            ColorStateList colorStateList = themeSingleton.positiveColor;
            if (colorStateList != null) {
                this.positiveColor = colorStateList;
            }
            ColorStateList colorStateList2 = themeSingleton.neutralColor;
            if (colorStateList2 != null) {
                this.neutralColor = colorStateList2;
            }
            ColorStateList colorStateList3 = themeSingleton.negativeColor;
            if (colorStateList3 != null) {
                this.negativeColor = colorStateList3;
            }
            int i6 = themeSingleton.itemColor;
            if (i6 != 0) {
                this.itemColor = i6;
            }
            Drawable drawable = themeSingleton.icon;
            if (drawable != null) {
                this.icon = drawable;
            }
            int i7 = themeSingleton.backgroundColor;
            if (i7 != 0) {
                this.backgroundColor = i7;
            }
            int i8 = themeSingleton.dividerColor;
            if (i8 != 0) {
                this.dividerColor = i8;
            }
            int i9 = themeSingleton.btnSelectorStacked;
            if (i9 != 0) {
                this.btnSelectorStacked = i9;
            }
            int i10 = themeSingleton.listSelector;
            if (i10 != 0) {
                this.listSelector = i10;
            }
            int i11 = themeSingleton.btnSelectorPositive;
            if (i11 != 0) {
                this.btnSelectorPositive = i11;
            }
            int i12 = themeSingleton.btnSelectorNeutral;
            if (i12 != 0) {
                this.btnSelectorNeutral = i12;
            }
            int i13 = themeSingleton.btnSelectorNegative;
            if (i13 != 0) {
                this.btnSelectorNegative = i13;
            }
            int i14 = themeSingleton.widgetColor;
            if (i14 != 0) {
                this.widgetColor = i14;
            }
            ColorStateList colorStateList4 = themeSingleton.linkColor;
            if (colorStateList4 != null) {
                this.linkColor = colorStateList4;
            }
            this.titleGravity = themeSingleton.titleGravity;
            this.contentGravity = themeSingleton.contentGravity;
            this.btnStackedGravity = themeSingleton.btnStackedGravity;
            this.itemsGravity = themeSingleton.itemsGravity;
            this.buttonsGravity = themeSingleton.buttonsGravity;
        }

        public Builder adapter(RecyclerView.AbstractC0562g<?> abstractC0562g, RecyclerView.AbstractC0570o abstractC0570o) {
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set adapter() when you're using a custom view.");
            }
            if (abstractC0570o != null && !(abstractC0570o instanceof LinearLayoutManager) && !(abstractC0570o instanceof GridLayoutManager)) {
                throw new IllegalStateException("You can currently only use LinearLayoutManager and GridLayoutManager with this library.");
            }
            this.adapter = abstractC0562g;
            this.layoutManager = abstractC0570o;
            return this;
        }

        public Builder alwaysCallInputCallback() {
            this.alwaysCallInputCallback = true;
            return this;
        }

        public Builder alwaysCallMultiChoiceCallback() {
            this.alwaysCallMultiChoiceCallback = true;
            return this;
        }

        public Builder alwaysCallSingleChoiceCallback() {
            this.alwaysCallSingleChoiceCallback = true;
            return this;
        }

        public Builder autoDismiss(boolean z3) {
            this.autoDismiss = z3;
            return this;
        }

        public Builder backgroundColor(int i4) {
            this.backgroundColor = i4;
            return this;
        }

        public Builder backgroundColorAttr(int i4) {
            return backgroundColor(ThemeUtils.resolveColor(this.context, i4));
        }

        public Builder backgroundColorRes(int i4) {
            return backgroundColor(ThemeUtils.getColor(this.context, i4));
        }

        public Builder btnSelector(int i4) {
            this.btnSelectorPositive = i4;
            this.btnSelectorNeutral = i4;
            this.btnSelectorNegative = i4;
            return this;
        }

        public Builder btnSelectorStacked(int i4) {
            this.btnSelectorStacked = i4;
            return this;
        }

        public Builder btnStackedGravity(GravityEnum gravityEnum) {
            this.btnStackedGravity = gravityEnum;
            return this;
        }

        public MaterialDialog build() {
            return new MaterialDialog(this);
        }

        public Builder buttonRippleColor(int i4) {
            this.buttonRippleColor = i4;
            return this;
        }

        public Builder buttonRippleColorAttr(int i4) {
            return buttonRippleColor(ThemeUtils.resolveColor(this.context, i4));
        }

        public Builder buttonRippleColorRes(int i4) {
            return buttonRippleColor(ThemeUtils.getColor(this.context, i4));
        }

        public Builder buttonsGravity(GravityEnum gravityEnum) {
            this.buttonsGravity = gravityEnum;
            return this;
        }

        public Builder callback(ButtonCallback buttonCallback) {
            this.callback = buttonCallback;
            return this;
        }

        public Builder cancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.cancelListener = onCancelListener;
            return this;
        }

        public Builder cancelable(boolean z3) {
            this.cancelable = z3;
            this.canceledOnTouchOutside = z3;
            return this;
        }

        public Builder canceledOnTouchOutside(boolean z3) {
            this.canceledOnTouchOutside = z3;
            return this;
        }

        public Builder checkBoxPrompt(CharSequence charSequence, boolean z3, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.checkBoxPrompt = charSequence;
            this.checkBoxPromptInitiallyChecked = z3;
            this.checkBoxPromptListener = onCheckedChangeListener;
            return this;
        }

        public Builder checkBoxPromptRes(int i4, boolean z3, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            return checkBoxPrompt(this.context.getResources().getText(i4), z3, onCheckedChangeListener);
        }

        public Builder choiceWidgetColor(ColorStateList colorStateList) {
            this.choiceWidgetColor = colorStateList;
            return this;
        }

        public Builder content(int i4) {
            return content(i4, false);
        }

        public Builder contentColor(int i4) {
            this.contentColor = i4;
            this.contentColorSet = true;
            return this;
        }

        public Builder contentColorAttr(int i4) {
            contentColor(ThemeUtils.resolveColor(this.context, i4));
            return this;
        }

        public Builder contentColorRes(int i4) {
            contentColor(ThemeUtils.getColor(this.context, i4));
            return this;
        }

        public Builder contentGravity(GravityEnum gravityEnum) {
            this.contentGravity = gravityEnum;
            return this;
        }

        public Builder contentLineSpacing(float f4) {
            this.contentLineSpacingMultiplier = f4;
            return this;
        }

        public Builder customTheme(int i4) {
            this.customTheme = i4;
            return this;
        }

        public Builder customView(int i4, boolean z3) {
            return customView(LayoutInflater.from(this.context).inflate(i4, (ViewGroup) null), z3);
        }

        public Builder dismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.dismissListener = onDismissListener;
            return this;
        }

        public Builder dividerColor(int i4) {
            this.dividerColor = i4;
            this.dividerColorSet = true;
            return this;
        }

        public Builder dividerColorAttr(int i4) {
            return dividerColor(ThemeUtils.resolveColor(this.context, i4));
        }

        public Builder dividerColorRes(int i4) {
            return dividerColor(ThemeUtils.getColor(this.context, i4));
        }

        public Builder fullScreen(boolean z3) {
            this.isFullScreen = z3;
            return this;
        }

        public final Context getContext() {
            return this.context;
        }

        public final int getItemColor() {
            return this.itemColor;
        }

        public final Typeface getRegularFont() {
            return this.regularFont;
        }

        public Builder icon(Drawable drawable) {
            this.icon = drawable;
            return this;
        }

        public Builder iconAttr(int i4) {
            this.icon = ThemeUtils.resolveDrawable(this.context, i4);
            return this;
        }

        public Builder iconRes(int i4) {
            if (i4 != -1) {
                this.icon = ResUtils.getDrawable(this.context, i4);
            }
            return this;
        }

        public Builder input(CharSequence charSequence, CharSequence charSequence2, boolean z3, InputCallback inputCallback) {
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.inputCallback = inputCallback;
            this.inputHint = charSequence;
            this.inputPrefill = charSequence2;
            this.inputAllowEmpty = z3;
            return this;
        }

        public Builder inputRange(int i4, int i5) {
            return inputRange(i4, i5, 0);
        }

        public Builder inputRangeRes(int i4, int i5, int i6) {
            return inputRange(i4, i5, ThemeUtils.getColor(this.context, i6));
        }

        public Builder inputType(int i4) {
            this.inputType = i4;
            return this;
        }

        public Builder items(Collection collection) {
            if (collection.size() > 0) {
                CharSequence[] charSequenceArr = new CharSequence[collection.size()];
                int i4 = 0;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    charSequenceArr[i4] = it.next().toString();
                    i4++;
                }
                items(charSequenceArr);
            } else if (collection.size() == 0) {
                this.items = new ArrayList<>();
            }
            return this;
        }

        public Builder itemsCallback(ListCallback listCallback) {
            this.listCallback = listCallback;
            this.listCallbackSingleChoice = null;
            this.listCallbackMultiChoice = null;
            return this;
        }

        public Builder itemsCallbackMultiChoice(Integer[] numArr, ListCallbackMultiChoice listCallbackMultiChoice) {
            this.selectedIndices = numArr;
            this.listCallback = null;
            this.listCallbackSingleChoice = null;
            this.listCallbackMultiChoice = listCallbackMultiChoice;
            return this;
        }

        public Builder itemsCallbackSingleChoice(int i4, ListCallbackSingleChoice listCallbackSingleChoice) {
            this.selectedIndex = i4;
            this.listCallback = null;
            this.listCallbackSingleChoice = listCallbackSingleChoice;
            this.listCallbackMultiChoice = null;
            return this;
        }

        public Builder itemsColor(int i4) {
            this.itemColor = i4;
            this.itemColorSet = true;
            return this;
        }

        public Builder itemsColorAttr(int i4) {
            return itemsColor(ThemeUtils.resolveColor(this.context, i4));
        }

        public Builder itemsColorRes(int i4) {
            return itemsColor(ThemeUtils.getColor(this.context, i4));
        }

        public Builder itemsDisabledIndices(Integer... numArr) {
            this.disabledIndices = numArr;
            return this;
        }

        public Builder itemsGravity(GravityEnum gravityEnum) {
            this.itemsGravity = gravityEnum;
            return this;
        }

        public Builder itemsIds(int[] iArr) {
            this.itemIds = iArr;
            return this;
        }

        public Builder itemsLongCallback(ListLongCallback listLongCallback) {
            this.listLongCallback = listLongCallback;
            this.listCallbackSingleChoice = null;
            this.listCallbackMultiChoice = null;
            return this;
        }

        public Builder keyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.keyListener = onKeyListener;
            return this;
        }

        public Builder limitIconToDefaultSize() {
            this.limitIconToDefaultSize = true;
            return this;
        }

        public Builder linkColor(int i4) {
            return linkColor(ThemeUtils.getActionTextStateList(this.context, i4));
        }

        public Builder linkColorAttr(int i4) {
            return linkColor(ThemeUtils.resolveActionTextColorStateList(this.context, i4, null));
        }

        public Builder linkColorRes(int i4) {
            return linkColor(ThemeUtils.getActionTextColorStateList(this.context, i4));
        }

        public Builder listSelector(int i4) {
            this.listSelector = i4;
            return this;
        }

        public Builder maxIconSize(int i4) {
            this.maxIconSize = i4;
            return this;
        }

        public Builder maxIconSizeRes(int i4) {
            return maxIconSize((int) this.context.getResources().getDimension(i4));
        }

        public Builder negativeColor(int i4) {
            return negativeColor(ThemeUtils.getActionTextStateList(this.context, i4));
        }

        public Builder negativeColorAttr(int i4) {
            return negativeColor(ThemeUtils.resolveActionTextColorStateList(this.context, i4, null));
        }

        public Builder negativeColorRes(int i4) {
            return negativeColor(ThemeUtils.getActionTextColorStateList(this.context, i4));
        }

        public Builder negativeFocus(boolean z3) {
            this.negativeFocus = z3;
            return this;
        }

        public Builder negativeText(int i4) {
            return i4 == 0 ? this : negativeText(this.context.getText(i4));
        }

        public Builder neutralColor(int i4) {
            return neutralColor(ThemeUtils.getActionTextStateList(this.context, i4));
        }

        public Builder neutralColorAttr(int i4) {
            return neutralColor(ThemeUtils.resolveActionTextColorStateList(this.context, i4, null));
        }

        public Builder neutralColorRes(int i4) {
            return neutralColor(ThemeUtils.getActionTextColorStateList(this.context, i4));
        }

        public Builder neutralFocus(boolean z3) {
            this.neutralFocus = z3;
            return this;
        }

        public Builder neutralText(int i4) {
            return i4 == 0 ? this : neutralText(this.context.getText(i4));
        }

        public Builder onAny(SingleButtonCallback singleButtonCallback) {
            this.onAnyCallback = singleButtonCallback;
            return this;
        }

        public Builder onNegative(SingleButtonCallback singleButtonCallback) {
            this.onNegativeCallback = singleButtonCallback;
            return this;
        }

        public Builder onNeutral(SingleButtonCallback singleButtonCallback) {
            this.onNeutralCallback = singleButtonCallback;
            return this;
        }

        public Builder onPositive(SingleButtonCallback singleButtonCallback) {
            this.onPositiveCallback = singleButtonCallback;
            return this;
        }

        public Builder positiveColor(int i4) {
            return positiveColor(ThemeUtils.getActionTextStateList(this.context, i4));
        }

        public Builder positiveColorAttr(int i4) {
            return positiveColor(ThemeUtils.resolveActionTextColorStateList(this.context, i4, null));
        }

        public Builder positiveColorRes(int i4) {
            return positiveColor(ThemeUtils.getActionTextColorStateList(this.context, i4));
        }

        public Builder positiveFocus(boolean z3) {
            this.positiveFocus = z3;
            return this;
        }

        public Builder positiveText(int i4) {
            if (i4 == 0) {
                return this;
            }
            positiveText(this.context.getText(i4));
            return this;
        }

        public Builder progress(boolean z3, int i4) {
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
            }
            if (z3) {
                this.indeterminateProgress = true;
                this.progress = -2;
            } else {
                this.indeterminateIsHorizontalProgress = false;
                this.indeterminateProgress = false;
                this.progress = -1;
                this.progressMax = i4;
            }
            return this;
        }

        public Builder progressIndeterminateStyle(boolean z3) {
            this.indeterminateIsHorizontalProgress = z3;
            return this;
        }

        public Builder progressNumberFormat(String str) {
            this.progressNumberFormat = str;
            return this;
        }

        public Builder progressPercentFormat(NumberFormat numberFormat) {
            this.progressPercentFormat = numberFormat;
            return this;
        }

        public MaterialDialog show() {
            MaterialDialog materialDialogBuild = build();
            materialDialogBuild.show();
            return materialDialogBuild;
        }

        public Builder showListener(DialogInterface.OnShowListener onShowListener) {
            this.showListener = onShowListener;
            return this;
        }

        public Builder stackingBehavior(StackingBehavior stackingBehavior) {
            this.stackingBehavior = stackingBehavior;
            return this;
        }

        public Builder tag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder theme(Theme theme) {
            this.theme = theme;
            return this;
        }

        public Builder title(int i4) {
            title(this.context.getText(i4));
            return this;
        }

        public Builder titleColor(int i4) {
            this.titleColor = i4;
            this.titleColorSet = true;
            return this;
        }

        public Builder titleColorAttr(int i4) {
            return titleColor(ThemeUtils.resolveColor(this.context, i4));
        }

        public Builder titleColorRes(int i4) {
            return titleColor(ThemeUtils.getColor(this.context, i4));
        }

        public Builder titleGravity(GravityEnum gravityEnum) {
            this.titleGravity = gravityEnum;
            return this;
        }

        public Builder typeface(Typeface typeface, Typeface typeface2) {
            this.mediumFont = typeface;
            this.regularFont = typeface2;
            return this;
        }

        public Builder widgetColor(int i4) {
            this.widgetColor = i4;
            this.widgetColorSet = true;
            return this;
        }

        public Builder widgetColorAttr(int i4) {
            return widgetColor(ThemeUtils.resolveColor(this.context, i4));
        }

        public Builder widgetColorRes(int i4) {
            return widgetColor(ThemeUtils.getColor(this.context, i4));
        }

        public Builder content(int i4, boolean z3) {
            CharSequence text = this.context.getText(i4);
            if (z3) {
                text = Html.fromHtml(text.toString().replace("\n", "<br/>"));
            }
            return content(text);
        }

        public Builder inputRange(int i4, int i5, int i6) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Min length for input dialogs cannot be less than 0.");
            }
            this.inputMinLength = i4;
            this.inputMaxLength = i5;
            if (i6 == 0) {
                this.inputRangeErrorColor = ThemeUtils.resolveColor(this.context, C2042R.attr.xui_config_color_error_text);
            } else {
                this.inputRangeErrorColor = i6;
            }
            if (this.inputMinLength > 0) {
                this.inputAllowEmpty = false;
            }
            return this;
        }

        public Builder itemsIds(int i4) {
            return itemsIds(this.context.getResources().getIntArray(i4));
        }

        public Builder linkColor(ColorStateList colorStateList) {
            this.linkColor = colorStateList;
            return this;
        }

        public Builder negativeColor(ColorStateList colorStateList) {
            this.negativeColor = colorStateList;
            this.negativeColorSet = true;
            return this;
        }

        public Builder negativeText(CharSequence charSequence) {
            this.negativeText = charSequence;
            return this;
        }

        public Builder neutralColor(ColorStateList colorStateList) {
            this.neutralColor = colorStateList;
            this.neutralColorSet = true;
            return this;
        }

        public Builder neutralText(CharSequence charSequence) {
            this.neutralText = charSequence;
            return this;
        }

        public Builder positiveColor(ColorStateList colorStateList) {
            this.positiveColor = colorStateList;
            this.positiveColorSet = true;
            return this;
        }

        public Builder positiveText(CharSequence charSequence) {
            this.positiveText = charSequence;
            return this;
        }

        public Builder title(CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public Builder customView(View view, boolean z3) {
            if (this.content == null) {
                if (this.items == null) {
                    if (this.inputCallback == null) {
                        if (this.progress <= -2 && !this.indeterminateProgress) {
                            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) view.getParent()).removeView(view);
                            }
                            this.customView = view;
                            this.wrapCustomViewInScroll = z3;
                            return this;
                        }
                        throw new IllegalStateException("You cannot use customView() with a progress dialog");
                    }
                    throw new IllegalStateException("You cannot use customView() with an input dialog");
                }
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            }
            throw new IllegalStateException("You cannot use customView() when you have content set.");
        }

        public Builder typeface(String str, String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface defaultTypeface = XUI.getDefaultTypeface(str);
                this.mediumFont = defaultTypeface;
                if (defaultTypeface == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface defaultTypeface2 = XUI.getDefaultTypeface(str2);
                this.regularFont = defaultTypeface2;
                if (defaultTypeface2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }

        public Builder btnSelector(int i4, DialogAction dialogAction) {
            int i5 = C21346.f9686x9cd0d1bf[dialogAction.ordinal()];
            if (i5 == 1) {
                this.btnSelectorNeutral = i4;
            } else if (i5 != 2) {
                this.btnSelectorPositive = i4;
            } else {
                this.btnSelectorNegative = i4;
            }
            return this;
        }

        public Builder content(CharSequence charSequence) {
            if (this.customView == null) {
                this.content = charSequence;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        public Builder input(CharSequence charSequence, CharSequence charSequence2, InputCallback inputCallback) {
            return input(charSequence, charSequence2, true, inputCallback);
        }

        public Builder content(int i4, Object... objArr) {
            return content(Html.fromHtml(String.format(this.context.getString(i4), objArr).replace("\n", "<br/>")));
        }

        public Builder input(int i4, int i5, boolean z3, InputCallback inputCallback) {
            return input(i4 == 0 ? null : this.context.getText(i4), i5 != 0 ? this.context.getText(i5) : null, z3, inputCallback);
        }

        public Builder items(int i4) {
            items(this.context.getResources().getTextArray(i4));
            return this;
        }

        public Builder items(CharSequence... charSequenceArr) {
            if (this.customView == null) {
                ArrayList<CharSequence> arrayList = new ArrayList<>();
                this.items = arrayList;
                Collections.addAll(arrayList, charSequenceArr);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }

        public Builder progress(boolean z3, int i4, boolean z4) {
            this.showMinMax = z4;
            return progress(z3, i4);
        }

        public Builder input(int i4, int i5, InputCallback inputCallback) {
            return input(i4, i5, true, inputCallback);
        }
    }

    @Deprecated
    public static abstract class ButtonCallback {
        protected final Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public final boolean equals(Object obj) {
            return super.equals(obj);
        }

        protected final void finalize() throws Throwable {
            super.finalize();
        }

        public final int hashCode() {
            return super.hashCode();
        }

        @Deprecated
        public void onAny(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onNegative(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onNeutral(MaterialDialog materialDialog) {
        }

        @Deprecated
        public void onPositive(MaterialDialog materialDialog) {
        }

        public final String toString() {
            return super.toString();
        }
    }

    private static class DialogException extends WindowManager.BadTokenException {
        DialogException(String str) {
            super(str);
        }
    }

    public interface InputCallback {
        void onInput(MaterialDialog materialDialog, CharSequence charSequence);
    }

    public interface ListCallback {
        void onSelection(MaterialDialog materialDialog, View view, int i4, CharSequence charSequence);
    }

    public interface ListCallbackMultiChoice {
        boolean onSelection(MaterialDialog materialDialog, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    public interface ListCallbackSingleChoice {
        boolean onSelection(MaterialDialog materialDialog, View view, int i4, CharSequence charSequence);
    }

    public interface ListLongCallback {
        boolean onLongSelection(MaterialDialog materialDialog, View view, int i4, CharSequence charSequence);
    }

    enum ListType {
        REGULAR,
        SINGLE,
        MULTI;

        public static int getLayoutForType(ListType listType) {
            int i4 = C21346.f9687x106dfa0c[listType.ordinal()];
            if (i4 == 1) {
                return C2042R.layout.xmd_layout_listitem;
            }
            if (i4 == 2) {
                return C2042R.layout.xmd_layout_listitem_single_choice;
            }
            if (i4 == 3) {
                return C2042R.layout.xmd_layout_listitem_multi_choice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    public interface SingleButtonCallback {
        void onClick(MaterialDialog materialDialog, DialogAction dialogAction);
    }

    @SuppressLint({"InflateParams"})
    protected MaterialDialog(Builder builder) {
        super(builder.context, DialogInit.getTheme(builder));
        this.handler = new Handler();
        this.builder = builder;
        this.view = (MDRootLayout) LayoutInflater.from(builder.context).inflate(DialogInit.getInflateLayout(builder), (ViewGroup) null);
        DialogInit.init(this);
    }

    private void hideKeyboard(DialogInterface dialogInterface, Builder builder) {
        InputMethodManager inputMethodManager;
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.getInputEditText() == null || (inputMethodManager = (InputMethodManager) builder.getContext().getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = materialDialog.getCurrentFocus();
        IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : materialDialog.getView().getWindowToken();
        if (windowToken != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    private boolean sendMultiChoiceCallback() {
        if (this.builder.listCallbackMultiChoice == null) {
            return false;
        }
        Collections.sort(this.selectedIndicesList);
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.selectedIndicesList) {
            if (num.intValue() >= 0 && num.intValue() <= this.builder.items.size() - 1) {
                arrayList.add(this.builder.items.get(num.intValue()));
            }
        }
        ListCallbackMultiChoice listCallbackMultiChoice = this.builder.listCallbackMultiChoice;
        List<Integer> list = this.selectedIndicesList;
        return listCallbackMultiChoice.onSelection(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
    }

    private boolean sendSingleChoiceCallback(View view) {
        Builder builder = this.builder;
        if (builder.listCallbackSingleChoice == null) {
            return false;
        }
        CharSequence charSequence = null;
        int i4 = builder.selectedIndex;
        if (i4 >= 0 && i4 < builder.items.size()) {
            Builder builder2 = this.builder;
            charSequence = builder2.items.get(builder2.selectedIndex);
        }
        Builder builder3 = this.builder;
        return builder3.listCallbackSingleChoice.onSelection(this, view, builder3.selectedIndex, charSequence);
    }

    private void showKeyboard(DialogInterface dialogInterface, final Builder builder) {
        final MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.getInputEditText() == null) {
            return;
        }
        materialDialog.getInputEditText().post(new Runnable() { // from class: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.5
            @Override // java.lang.Runnable
            public void run() {
                materialDialog.getInputEditText().requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) builder.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(materialDialog.getInputEditText(), 1);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSuper() {
        super.show();
    }

    final void checkIfListInitScroll() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                final int iIntValue;
                MaterialDialog.this.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MaterialDialog materialDialog = MaterialDialog.this;
                ListType listType = materialDialog.listType;
                ListType listType2 = ListType.SINGLE;
                if (listType == listType2 || listType == ListType.MULTI) {
                    if (listType == listType2) {
                        iIntValue = materialDialog.builder.selectedIndex;
                        if (iIntValue < 0) {
                            return;
                        }
                    } else {
                        List<Integer> list = materialDialog.selectedIndicesList;
                        if (list == null || list.size() == 0) {
                            return;
                        }
                        Collections.sort(MaterialDialog.this.selectedIndicesList);
                        iIntValue = MaterialDialog.this.selectedIndicesList.get(0).intValue();
                    }
                    MaterialDialog.this.recyclerView.post(new Runnable() { // from class: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MaterialDialog.this.recyclerView.requestFocus();
                            MaterialDialog.this.builder.layoutManager.scrollToPosition(iIntValue);
                        }
                    });
                }
            }
        });
    }

    public void clearSelectedIndices() {
        clearSelectedIndices(true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.input != null) {
            hideKeyboard(this, this.builder);
        }
        super.dismiss();
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.DialogBase, android.app.Dialog
    public /* bridge */ /* synthetic */ View findViewById(int i4) {
        return super.findViewById(i4);
    }

    public final MDButton getActionButton(DialogAction dialogAction) {
        int i4 = C21346.f9686x9cd0d1bf[dialogAction.ordinal()];
        return i4 != 1 ? i4 != 2 ? this.positiveButton : this.negativeButton : this.neutralButton;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    Drawable getButtonSelector(DialogAction dialogAction, boolean z3) {
        if (z3) {
            Builder builder = this.builder;
            int i4 = builder.btnSelectorStacked;
            if (i4 != 0) {
                return ResUtils.getDrawable(builder.context, i4);
            }
            Context context = builder.context;
            int i5 = C2042R.attr.md_btn_stacked_selector;
            Drawable drawableResolveDrawable = ThemeUtils.resolveDrawable(context, i5);
            return drawableResolveDrawable != null ? drawableResolveDrawable : ThemeUtils.resolveDrawable(getContext(), i5);
        }
        int i6 = C21346.f9686x9cd0d1bf[dialogAction.ordinal()];
        if (i6 == 1) {
            Builder builder2 = this.builder;
            int i7 = builder2.btnSelectorNeutral;
            if (i7 != 0) {
                return ResUtils.getDrawable(builder2.context, i7);
            }
            Context context2 = builder2.context;
            int i8 = C2042R.attr.md_btn_neutral_selector;
            Drawable drawableResolveDrawable2 = ThemeUtils.resolveDrawable(context2, i8);
            if (drawableResolveDrawable2 != null) {
                return drawableResolveDrawable2;
            }
            Drawable drawableResolveDrawable3 = ThemeUtils.resolveDrawable(getContext(), i8);
            RippleHelper.applyColor(drawableResolveDrawable3, this.builder.buttonRippleColor);
            return drawableResolveDrawable3;
        }
        if (i6 != 2) {
            Builder builder3 = this.builder;
            int i9 = builder3.btnSelectorPositive;
            if (i9 != 0) {
                return ResUtils.getDrawable(builder3.context, i9);
            }
            Context context3 = builder3.context;
            int i10 = C2042R.attr.md_btn_positive_selector;
            Drawable drawableResolveDrawable4 = ThemeUtils.resolveDrawable(context3, i10);
            if (drawableResolveDrawable4 != null) {
                return drawableResolveDrawable4;
            }
            Drawable drawableResolveDrawable5 = ThemeUtils.resolveDrawable(getContext(), i10);
            RippleHelper.applyColor(drawableResolveDrawable5, this.builder.buttonRippleColor);
            return drawableResolveDrawable5;
        }
        Builder builder4 = this.builder;
        int i11 = builder4.btnSelectorNegative;
        if (i11 != 0) {
            return ResUtils.getDrawable(builder4.context, i11);
        }
        Context context4 = builder4.context;
        int i12 = C2042R.attr.md_btn_negative_selector;
        Drawable drawableResolveDrawable6 = ThemeUtils.resolveDrawable(context4, i12);
        if (drawableResolveDrawable6 != null) {
            return drawableResolveDrawable6;
        }
        Drawable drawableResolveDrawable7 = ThemeUtils.resolveDrawable(getContext(), i12);
        RippleHelper.applyColor(drawableResolveDrawable7, this.builder.buttonRippleColor);
        return drawableResolveDrawable7;
    }

    public final TextView getContentView() {
        return this.content;
    }

    public final int getCurrentProgress() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getProgress();
    }

    public final View getCustomView() {
        return this.builder.customView;
    }

    public ImageView getIconView() {
        return this.icon;
    }

    public final EditText getInputEditText() {
        return this.input;
    }

    public final ArrayList<CharSequence> getItems() {
        return this.builder.items;
    }

    final Drawable getListSelector() {
        Builder builder = this.builder;
        int i4 = builder.listSelector;
        if (i4 != 0) {
            return ResUtils.getDrawable(builder.context, i4);
        }
        Context context = builder.context;
        int i5 = C2042R.attr.md_list_selector;
        Drawable drawableResolveDrawable = ThemeUtils.resolveDrawable(context, i5);
        return drawableResolveDrawable != null ? drawableResolveDrawable : ThemeUtils.resolveDrawable(getContext(), i5);
    }

    public final int getMaxProgress() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getMax();
    }

    public ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public int getSelectedIndex() {
        Builder builder = this.builder;
        if (builder.listCallbackSingleChoice != null) {
            return builder.selectedIndex;
        }
        return -1;
    }

    public Integer[] getSelectedIndices() {
        if (this.builder.listCallbackMultiChoice == null) {
            return null;
        }
        List<Integer> list = this.selectedIndicesList;
        return (Integer[]) list.toArray(new Integer[list.size()]);
    }

    public Object getTag() {
        return this.builder.tag;
    }

    public final TextView getTitleView() {
        return this.title;
    }

    public final View getView() {
        return this.view;
    }

    public final boolean hasActionButtons() {
        return numberOfActionButtons() > 0;
    }

    public final void incrementProgress(int i4) {
        setProgress(getCurrentProgress() + i4);
    }

    void invalidateInputMinMaxIndicator(int i4, boolean z3) {
        Builder builder;
        int i5;
        TextView textView = this.inputMinMax;
        if (textView != null) {
            if (this.builder.inputMaxLength > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i4), Integer.valueOf(this.builder.inputMaxLength)));
                this.inputMinMax.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean z4 = (z3 && i4 == 0) || ((i5 = (builder = this.builder).inputMaxLength) > 0 && i4 > i5) || i4 < builder.inputMinLength;
            Builder builder2 = this.builder;
            int i6 = z4 ? builder2.inputRangeErrorColor : builder2.contentColor;
            Builder builder3 = this.builder;
            int i7 = z4 ? builder3.inputRangeErrorColor : builder3.widgetColor;
            if (this.builder.inputMaxLength > 0) {
                this.inputMinMax.setTextColor(i6);
            }
            MDTintHelper.setTint(this.input, i7);
            getActionButton(DialogAction.POSITIVE).setEnabled(!z4);
        }
    }

    final void invalidateList() {
        if (this.recyclerView == null) {
            return;
        }
        ArrayList<CharSequence> arrayList = this.builder.items;
        if ((arrayList == null || arrayList.size() == 0) && this.builder.adapter == null) {
            return;
        }
        Builder builder = this.builder;
        if (builder.layoutManager == null) {
            builder.layoutManager = new LinearLayoutManager(getContext());
        }
        if (this.recyclerView.getLayoutManager() == null) {
            this.recyclerView.setLayoutManager(this.builder.layoutManager);
        }
        this.recyclerView.setAdapter(this.builder.adapter);
        if (this.listType != null) {
            ((DefaultRvAdapter) this.builder.adapter).setCallback(this);
        }
    }

    public final boolean isCancelled() {
        return !isShowing();
    }

    public final boolean isIndeterminateProgress() {
        return this.builder.indeterminateProgress;
    }

    public boolean isPromptCheckBoxChecked() {
        CheckBox checkBox = this.checkBoxPrompt;
        return checkBox != null && checkBox.isChecked();
    }

    public final void notifyItemChanged(int i4) {
        this.builder.adapter.notifyItemChanged(i4);
    }

    public final void notifyItemInserted(int i4) {
        this.builder.adapter.notifyItemInserted(i4);
    }

    public final void notifyItemsChanged() {
        this.builder.adapter.notifyDataSetChanged();
    }

    public final int numberOfActionButtons() {
        int i4 = (this.builder.positiveText == null || this.positiveButton.getVisibility() != 0) ? 0 : 1;
        if (this.builder.neutralText != null && this.neutralButton.getVisibility() == 0) {
            i4++;
        }
        return (this.builder.negativeText == null || this.negativeButton.getVisibility() != 0) ? i4 : i4 + 1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        DialogAction dialogAction = (DialogAction) view.getTag();
        int i4 = C21346.f9686x9cd0d1bf[dialogAction.ordinal()];
        if (i4 == 1) {
            ButtonCallback buttonCallback = this.builder.callback;
            if (buttonCallback != null) {
                buttonCallback.onAny(this);
                this.builder.callback.onNeutral(this);
            }
            SingleButtonCallback singleButtonCallback = this.builder.onNeutralCallback;
            if (singleButtonCallback != null) {
                singleButtonCallback.onClick(this, dialogAction);
            }
            if (this.builder.autoDismiss) {
                dismiss();
            }
        } else if (i4 == 2) {
            ButtonCallback buttonCallback2 = this.builder.callback;
            if (buttonCallback2 != null) {
                buttonCallback2.onAny(this);
                this.builder.callback.onNegative(this);
            }
            SingleButtonCallback singleButtonCallback2 = this.builder.onNegativeCallback;
            if (singleButtonCallback2 != null) {
                singleButtonCallback2.onClick(this, dialogAction);
            }
            if (this.builder.autoDismiss) {
                cancel();
            }
        } else if (i4 == 3) {
            ButtonCallback buttonCallback3 = this.builder.callback;
            if (buttonCallback3 != null) {
                buttonCallback3.onAny(this);
                this.builder.callback.onPositive(this);
            }
            SingleButtonCallback singleButtonCallback3 = this.builder.onPositiveCallback;
            if (singleButtonCallback3 != null) {
                singleButtonCallback3.onClick(this, dialogAction);
            }
            if (!this.builder.alwaysCallSingleChoiceCallback) {
                sendSingleChoiceCallback(view);
            }
            if (!this.builder.alwaysCallMultiChoiceCallback) {
                sendMultiChoiceCallback();
            }
            Builder builder = this.builder;
            InputCallback inputCallback = builder.inputCallback;
            if (inputCallback != null && (editText = this.input) != null && !builder.alwaysCallInputCallback) {
                inputCallback.onInput(this, editText.getText());
            }
            if (this.builder.autoDismiss) {
                dismiss();
            }
        }
        SingleButtonCallback singleButtonCallback4 = this.builder.onAnyCallback;
        if (singleButtonCallback4 != null) {
            singleButtonCallback4.onClick(this, dialogAction);
        }
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.DefaultRvAdapter.InternalListCallback
    public boolean onItemSelected(MaterialDialog materialDialog, View view, int i4, CharSequence charSequence, boolean z3) {
        Builder builder;
        ListLongCallback listLongCallback;
        Builder builder2;
        ListCallback listCallback;
        boolean zSendSingleChoiceCallback = false;
        if (!view.isEnabled()) {
            return false;
        }
        ListType listType = this.listType;
        if (listType == null || listType == ListType.REGULAR) {
            if (this.builder.autoDismiss) {
                dismiss();
            }
            if (!z3 && (listCallback = (builder2 = this.builder).listCallback) != null) {
                listCallback.onSelection(this, view, i4, builder2.items.get(i4));
            }
            if (z3 && (listLongCallback = (builder = this.builder).listLongCallback) != null) {
                return listLongCallback.onLongSelection(this, view, i4, builder.items.get(i4));
            }
        } else if (listType == ListType.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(C2042R.id.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (!this.selectedIndicesList.contains(Integer.valueOf(i4))) {
                this.selectedIndicesList.add(Integer.valueOf(i4));
                if (!this.builder.alwaysCallMultiChoiceCallback || sendMultiChoiceCallback()) {
                    checkBox.setChecked(true);
                } else {
                    this.selectedIndicesList.remove(Integer.valueOf(i4));
                }
            } else {
                this.selectedIndicesList.remove(Integer.valueOf(i4));
                if (!this.builder.alwaysCallMultiChoiceCallback || sendMultiChoiceCallback()) {
                    checkBox.setChecked(false);
                } else {
                    this.selectedIndicesList.add(Integer.valueOf(i4));
                }
            }
        } else if (listType == ListType.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(C2042R.id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            Builder builder3 = this.builder;
            int i5 = builder3.selectedIndex;
            if (builder3.autoDismiss && builder3.positiveText == null) {
                dismiss();
                this.builder.selectedIndex = i4;
                sendSingleChoiceCallback(view);
            } else if (builder3.alwaysCallSingleChoiceCallback) {
                builder3.selectedIndex = i4;
                zSendSingleChoiceCallback = sendSingleChoiceCallback(view);
                this.builder.selectedIndex = i5;
            } else {
                zSendSingleChoiceCallback = true;
            }
            if (zSendSingleChoiceCallback) {
                this.builder.selectedIndex = i4;
                radioButton.setChecked(true);
                this.builder.adapter.notifyItemChanged(i5);
                this.builder.adapter.notifyItemChanged(i4);
            }
        }
        return true;
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.DialogBase, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.input != null) {
            showKeyboard(this, this.builder);
            if (this.input.getText().length() > 0) {
                EditText editText = this.input;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.DialogBase, android.app.Dialog
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void selectAllIndices() {
        selectAllIndices(true);
    }

    public final void setActionButton(DialogAction dialogAction, CharSequence charSequence) {
        int i4 = C21346.f9686x9cd0d1bf[dialogAction.ordinal()];
        if (i4 == 1) {
            this.builder.neutralText = charSequence;
            this.neutralButton.setText(charSequence);
            this.neutralButton.setVisibility(charSequence != null ? 0 : 8);
        } else if (i4 != 2) {
            this.builder.positiveText = charSequence;
            this.positiveButton.setText(charSequence);
            this.positiveButton.setVisibility(charSequence != null ? 0 : 8);
        } else {
            this.builder.negativeText = charSequence;
            this.negativeButton.setText(charSequence);
            this.negativeButton.setVisibility(charSequence != null ? 0 : 8);
        }
    }

    public final void setContent(CharSequence charSequence) {
        this.content.setText(charSequence);
        this.content.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.DialogBase, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(int i4) throws IllegalAccessError {
        super.setContentView(i4);
    }

    public void setIcon(int i4) {
        this.icon.setImageResource(i4);
        this.icon.setVisibility(i4 != 0 ? 0 : 8);
    }

    public void setIconAttribute(int i4) {
        setIcon(ThemeUtils.resolveDrawable(this.builder.context, i4));
    }

    void setInternalInputCallback() {
        EditText editText = this.input;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new TextWatcher() { // from class: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int length = charSequence.toString().length();
                MaterialDialog materialDialog = MaterialDialog.this;
                if (!materialDialog.builder.inputAllowEmpty) {
                    z = length == 0;
                    materialDialog.getActionButton(DialogAction.POSITIVE).setEnabled(!z);
                }
                MaterialDialog.this.invalidateInputMinMaxIndicator(length, z);
                MaterialDialog materialDialog2 = MaterialDialog.this;
                Builder builder = materialDialog2.builder;
                if (builder.alwaysCallInputCallback) {
                    builder.inputCallback.onInput(materialDialog2, charSequence);
                }
            }
        });
    }

    public final void setItems(CharSequence... charSequenceArr) {
        Builder builder = this.builder;
        if (builder.adapter == null) {
            throw new IllegalStateException("This MaterialDialog instance does not yet have an adapter set to it. You cannot use setItems().");
        }
        if (charSequenceArr != null) {
            builder.items = new ArrayList<>(charSequenceArr.length);
            Collections.addAll(this.builder.items, charSequenceArr);
        } else {
            builder.items = null;
        }
        if (!(this.builder.adapter instanceof DefaultRvAdapter)) {
            throw new IllegalStateException("When using a custom adapter, setItems() cannot be used. Set items through the adapter instead.");
        }
        notifyItemsChanged();
    }

    public final void setMaxProgress(int i4) {
        if (this.builder.progress <= -2) {
            throw new IllegalStateException("Cannot use setMaxProgress() on this dialog.");
        }
        this.progressBar.setMax(i4);
    }

    public final void setProgress(int i4) {
        if (this.builder.progress <= -2) {
            Log.w("MaterialDialog", "Calling setProgress(int) on an indeterminate progress dialog has no effect!");
        } else {
            this.progressBar.setProgress(i4);
            this.handler.post(new Runnable() { // from class: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.3
                @Override // java.lang.Runnable
                public void run() {
                    MaterialDialog materialDialog = MaterialDialog.this;
                    TextView textView = materialDialog.progressLabel;
                    if (textView != null) {
                        textView.setText(materialDialog.builder.progressPercentFormat.format(materialDialog.getCurrentProgress() / MaterialDialog.this.getMaxProgress()));
                    }
                    MaterialDialog materialDialog2 = MaterialDialog.this;
                    TextView textView2 = materialDialog2.progressMinMax;
                    if (textView2 != null) {
                        textView2.setText(String.format(materialDialog2.builder.progressNumberFormat, Integer.valueOf(materialDialog2.getCurrentProgress()), Integer.valueOf(MaterialDialog.this.getMaxProgress())));
                    }
                }
            });
        }
    }

    public final void setProgressNumberFormat(String str) {
        this.builder.progressNumberFormat = str;
        setProgress(getCurrentProgress());
    }

    public final void setProgressPercentFormat(NumberFormat numberFormat) {
        this.builder.progressPercentFormat = numberFormat;
        setProgress(getCurrentProgress());
    }

    public void setPromptCheckBoxChecked(boolean z3) {
        CheckBox checkBox = this.checkBoxPrompt;
        if (checkBox != null) {
            checkBox.setChecked(z3);
        }
    }

    public void setSelectedIndex(int i4) {
        Builder builder = this.builder;
        builder.selectedIndex = i4;
        RecyclerView.AbstractC0562g<?> abstractC0562g = builder.adapter;
        if (abstractC0562g == null || !(abstractC0562g instanceof DefaultRvAdapter)) {
            throw new IllegalStateException("You can only use setSelectedIndex() with the default adapter implementation.");
        }
        abstractC0562g.notifyDataSetChanged();
    }

    public void setSelectedIndices(Integer[] numArr) {
        this.selectedIndicesList = new ArrayList(Arrays.asList(numArr));
        RecyclerView.AbstractC0562g<?> abstractC0562g = this.builder.adapter;
        if (abstractC0562g == null || !(abstractC0562g instanceof DefaultRvAdapter)) {
            throw new IllegalStateException("You can only use setSelectedIndices() with the default adapter implementation.");
        }
        abstractC0562g.notifyDataSetChanged();
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.title.setText(charSequence);
    }

    public final void setTypeface(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (this.builder.isFullScreen) {
                StatusBarUtils.showWindowInFullScreen(getWindow(), new StatusBarUtils.IWindowShower() { // from class: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.2
                    @Override // com.xuexiang.xui.utils.StatusBarUtils.IWindowShower
                    public void show(Window window) {
                        MaterialDialog.this.showSuper();
                    }
                });
            } else {
                showSuper();
            }
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    public void clearSelectedIndices(boolean z3) {
        ListType listType = this.listType;
        if (listType == null || listType != ListType.MULTI) {
            throw new IllegalStateException("You can only use clearSelectedIndices() with multi choice list dialogs.");
        }
        RecyclerView.AbstractC0562g<?> abstractC0562g = this.builder.adapter;
        if (abstractC0562g == null || !(abstractC0562g instanceof DefaultRvAdapter)) {
            throw new IllegalStateException("You can only use clearSelectedIndices() with the default adapter implementation.");
        }
        List<Integer> list = this.selectedIndicesList;
        if (list != null) {
            list.clear();
        }
        this.builder.adapter.notifyDataSetChanged();
        if (!z3 || this.builder.listCallbackMultiChoice == null) {
            return;
        }
        sendMultiChoiceCallback();
    }

    public void selectAllIndices(boolean z3) {
        ListType listType = this.listType;
        if (listType == null || listType != ListType.MULTI) {
            throw new IllegalStateException("You can only use selectAllIndices() with multi choice list dialogs.");
        }
        RecyclerView.AbstractC0562g<?> abstractC0562g = this.builder.adapter;
        if (abstractC0562g == null || !(abstractC0562g instanceof DefaultRvAdapter)) {
            throw new IllegalStateException("You can only use selectAllIndices() with the default adapter implementation.");
        }
        if (this.selectedIndicesList == null) {
            this.selectedIndicesList = new ArrayList();
        }
        for (int i4 = 0; i4 < this.builder.adapter.getItemCount(); i4++) {
            if (!this.selectedIndicesList.contains(Integer.valueOf(i4))) {
                this.selectedIndicesList.add(Integer.valueOf(i4));
            }
        }
        this.builder.adapter.notifyDataSetChanged();
        if (!z3 || this.builder.listCallbackMultiChoice == null) {
            return;
        }
        sendMultiChoiceCallback();
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.DialogBase, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(View view) throws IllegalAccessError {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i4) {
        setTitle(this.builder.context.getString(i4));
    }

    public final void setContent(int i4) {
        setContent(this.builder.context.getString(i4));
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.DialogBase, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        super.setContentView(view, layoutParams);
    }

    public void setIcon(Drawable drawable) {
        this.icon.setImageDrawable(drawable);
        this.icon.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setTitle(int i4, Object... objArr) {
        setTitle(this.builder.context.getString(i4, objArr));
    }

    public final void setContent(int i4, Object... objArr) {
        setContent(this.builder.context.getString(i4, objArr));
    }

    public final void setActionButton(DialogAction dialogAction, int i4) {
        setActionButton(dialogAction, getContext().getText(i4));
    }
}
