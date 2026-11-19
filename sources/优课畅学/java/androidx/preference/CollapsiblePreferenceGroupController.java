package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.animation.core.AnimationKt;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class CollapsiblePreferenceGroupController {
    private final Context mContext;
    private boolean mHasExpandablePreference = false;
    final PreferenceGroupAdapter mPreferenceGroupAdapter;

    public static class ExpandButton extends Preference {
        private long mId;

        public ExpandButton(Context context, List<Preference> list, long j10) {
            super(context);
            initLayout();
            setSummary(list);
            this.mId = j10 + AnimationKt.MillisToNanos;
        }

        private void initLayout() {
            setLayoutResource(C4447R.layout.expand_button);
            setIcon(C4447R.drawable.ic_arrow_down_24dp);
            setTitle(C4447R.string.expand_button_title);
            setOrder(999);
        }

        private void setSummary(List<Preference> list) {
            ArrayList arrayList = new ArrayList();
            CharSequence string = null;
            for (Preference preference : list) {
                CharSequence title = preference.getTitle();
                boolean z10 = preference instanceof PreferenceGroup;
                if (z10 && !TextUtils.isEmpty(title)) {
                    arrayList.add((PreferenceGroup) preference);
                }
                if (arrayList.contains(preference.getParent())) {
                    if (z10) {
                        arrayList.add((PreferenceGroup) preference);
                    }
                } else if (!TextUtils.isEmpty(title)) {
                    string = string == null ? title : getContext().getString(C4447R.string.summary_collapsed_preference_list, string, title);
                }
            }
            setSummary(string);
        }

        @Override // androidx.preference.Preference
        public long getId() {
            return this.mId;
        }

        @Override // androidx.preference.Preference
        public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
            super.onBindViewHolder(preferenceViewHolder);
            preferenceViewHolder.setDividerAllowedAbove(false);
        }
    }

    public CollapsiblePreferenceGroupController(PreferenceGroup preferenceGroup, PreferenceGroupAdapter preferenceGroupAdapter) {
        this.mPreferenceGroupAdapter = preferenceGroupAdapter;
        this.mContext = preferenceGroup.getContext();
    }

    private ExpandButton createExpandButton(final PreferenceGroup preferenceGroup, List<Preference> list) {
        ExpandButton expandButton = new ExpandButton(this.mContext, list, preferenceGroup.getId());
        expandButton.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: androidx.preference.CollapsiblePreferenceGroupController.1
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                preferenceGroup.setInitialExpandedChildrenCount(Integer.MAX_VALUE);
                CollapsiblePreferenceGroupController.this.mPreferenceGroupAdapter.onPreferenceHierarchyChange(preference);
                PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener = preferenceGroup.getOnExpandButtonClickListener();
                if (onExpandButtonClickListener == null) {
                    return true;
                }
                onExpandButtonClickListener.onExpandButtonClick();
                return true;
            }
        });
        return expandButton;
    }

    private List<Preference> createInnerVisiblePreferencesList(PreferenceGroup preferenceGroup) {
        this.mHasExpandablePreference = false;
        boolean z10 = preferenceGroup.getInitialExpandedChildrenCount() != Integer.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i10 = 0;
        for (int i11 = 0; i11 < preferenceCount; i11++) {
            Preference preference = preferenceGroup.getPreference(i11);
            if (preference.isVisible()) {
                if (!z10 || i10 < preferenceGroup.getInitialExpandedChildrenCount()) {
                    arrayList.add(preference);
                } else {
                    arrayList2.add(preference);
                }
                if (preference instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                    if (preferenceGroup2.isOnSameScreenAsChildren()) {
                        List<Preference> listCreateInnerVisiblePreferencesList = createInnerVisiblePreferencesList(preferenceGroup2);
                        if (z10 && this.mHasExpandablePreference) {
                            throw new IllegalArgumentException("Nested expand buttons are not supported!");
                        }
                        for (Preference preference2 : listCreateInnerVisiblePreferencesList) {
                            if (!z10 || i10 < preferenceGroup.getInitialExpandedChildrenCount()) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i10++;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i10++;
                }
            }
        }
        if (z10 && i10 > preferenceGroup.getInitialExpandedChildrenCount()) {
            arrayList.add(createExpandButton(preferenceGroup, arrayList2));
        }
        this.mHasExpandablePreference |= z10;
        return arrayList;
    }

    public List<Preference> createVisiblePreferencesList(PreferenceGroup preferenceGroup) {
        return createInnerVisiblePreferencesList(preferenceGroup);
    }

    public boolean onPreferenceVisibilityChange(Preference preference) {
        if (!(preference instanceof PreferenceGroup) && !this.mHasExpandablePreference) {
            return false;
        }
        this.mPreferenceGroupAdapter.onPreferenceHierarchyChange(preference);
        return true;
    }
}
