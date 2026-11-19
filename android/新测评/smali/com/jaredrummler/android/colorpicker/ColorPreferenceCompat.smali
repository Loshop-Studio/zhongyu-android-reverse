.class public Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;
.super Landroidx/preference/Preference;
.source "SourceFile"

# interfaces
.implements Lp1/b;


# instance fields
.field public a:I

.field public b:Z

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:[I

.field public k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/high16 p1, -0x1000000

    .line 5
    .line 6
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->a:I

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->e(Landroid/util/AttributeSet;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->f(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Landroidx/fragment/app/FragmentActivity;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/preference/Preference;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroidx/fragment/app/FragmentActivity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Landroid/content/ContextWrapper;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, v0, Landroidx/fragment/app/FragmentActivity;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v1, "Error getting activity from context"

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "color_"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/preference/Preference;->getKey()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final e(Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->setPersistent(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/preference/Preference;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference:[I

    .line 10
    .line 11
    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_showDialog:I

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->b:Z

    .line 22
    .line 23
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_dialogType:I

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->c:I

    .line 30
    .line 31
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_colorShape:I

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->d:I

    .line 38
    .line 39
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_allowPresets:I

    .line 40
    .line 41
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->e:Z

    .line 46
    .line 47
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_allowCustom:I

    .line 48
    .line 49
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->f:Z

    .line 54
    .line 55
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_showAlphaSlider:I

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->g:Z

    .line 63
    .line 64
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_showColorShades:I

    .line 65
    .line 66
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->h:Z

    .line 71
    .line 72
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_previewSize:I

    .line 73
    .line 74
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->i:I

    .line 79
    .line 80
    sget v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_colorPresets:I

    .line 81
    .line 82
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    sget v2, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPreference_cpv_dialogTitle:I

    .line 87
    .line 88
    sget v3, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_default_title:I

    .line 89
    .line 90
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    iput v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->k:I

    .line 95
    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    invoke-virtual {p0}, Landroidx/preference/Preference;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getIntArray(I)[I

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->j:[I

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    sget-object v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->u:[I

    .line 114
    .line 115
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->j:[I

    .line 116
    .line 117
    :goto_0
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->d:I

    .line 118
    .line 119
    if-ne v1, v0, :cond_2

    .line 120
    .line 121
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->i:I

    .line 122
    .line 123
    if-ne v1, v0, :cond_1

    .line 124
    .line 125
    sget v0, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_preference_circle_large:I

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    sget v0, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_preference_circle:I

    .line 129
    .line 130
    :goto_1
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->setWidgetLayoutResource(I)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_2
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->i:I

    .line 135
    .line 136
    if-ne v1, v0, :cond_3

    .line 137
    .line 138
    sget v0, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_preference_square_large:I

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    sget v0, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_preference_square:I

    .line 142
    .line 143
    :goto_2
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->setWidgetLayoutResource(I)V

    .line 144
    .line 145
    .line 146
    :goto_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public f(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->a:I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->persistInt(I)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/preference/Preference;->notifyChanged()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->callChangeListener(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onAttached()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/preference/Preference;->onAttached()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->b:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->c()Landroidx/fragment/app/FragmentActivity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->d()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p(Lp1/b;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public onBindViewHolder(Landroidx/preference/PreferenceViewHolder;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/preference/Preference;->onBindViewHolder(Landroidx/preference/PreferenceViewHolder;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 5
    .line 6
    sget v0, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_preference_preview_color_panel:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->a:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onClick()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/preference/Preference;->onClick()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->b:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->k()Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->c:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->g(I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->k:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->f(I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->d:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->e(I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->j:[I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->h([I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->e:Z

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->c(Z)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->f:Z

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->b(Z)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->g:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->i(Z)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->h:Z

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->j(Z)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->a:I

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->d(I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->a()Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p(Lp1/b;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->c()Landroidx/fragment/app/FragmentActivity;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->d()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 94
    .line 95
    .line 96
    :cond_0
    return-void
.end method

.method public onGetDefaultValue(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public onSetInitialValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/preference/Preference;->onSetInitialValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Ljava/lang/Integer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->a:I

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->persistInt(I)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/high16 p1, -0x1000000

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->getPersistedInt(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;->a:I

    .line 27
    .line 28
    return-void
.end method
