.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;
.super Landroidx/fragment/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    }
.end annotation


# static fields
.field public static final u:[I


# instance fields
.field public a:Le1/b;

.field public b:Landroid/widget/FrameLayout;

.field public c:[I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:I

.field public i:Lcom/jaredrummler/android/colorpicker/a;

.field public j:Landroid/widget/LinearLayout;

.field public k:Landroid/widget/SeekBar;

.field public l:Landroid/widget/TextView;

.field public m:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

.field public n:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

.field public o:Landroid/widget/EditText;

.field public p:Z

.field public q:I

.field public r:Z

.field public s:I

.field public final t:Landroid/view/View$OnTouchListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->u:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0xbbcca
        -0x16e19d
        -0xd36d
        -0x63d850
        -0x98c549
        -0xc0ae4b
        -0xde690d
        -0xfc560c
        -0xff432c
        -0xff6978
        -0xb350b0
        -0x743cb6
        -0x3223c7
        -0x14c5
        -0x3ef9
        -0x6800
        -0x86aab8
        -0x9f8275
        -0x616162
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$b;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->t:Landroid/view/View$OnTouchListener;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic f(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->s:I

    .line 2
    .line 3
    return p0
.end method

.method private getSelectedItemPosition()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget v1, v1, v0

    .line 8
    .line 9
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public static synthetic h(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->q:I

    .line 2
    .line 3
    return p0
.end method

.method public static n()Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->q(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getColor()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->r:Z

    .line 27
    .line 28
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    .line 29
    .line 30
    invoke-virtual {v1, p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n(IZ)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->n:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->r:Z

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->t(I)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "input_method"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 54
    .line 55
    .line 56
    :cond_1
    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->r:Z

    .line 57
    .line 58
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public i(I)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->l(I)[I

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :goto_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j:Landroid/widget/LinearLayout;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge v2, v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/widget/FrameLayout;

    .line 30
    .line 31
    sget v3, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_view:I

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 38
    .line 39
    sget v4, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_image_view:I

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/widget/ImageView;

    .line 46
    .line 47
    aget v4, p1, v2

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 50
    .line 51
    .line 52
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget v3, Lcom/jaredrummler/android/colorpicker/R$dimen;->cpv_item_horizontal_padding:I

    .line 68
    .line 69
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    array-length v3, p1

    .line 74
    :goto_1
    if-ge v2, v3, :cond_2

    .line 75
    .line 76
    aget v4, p1, v2

    .line 77
    .line 78
    iget v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h:I

    .line 79
    .line 80
    if-nez v5, :cond_1

    .line 81
    .line 82
    sget v5, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_color_item_square:I

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    sget v5, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_color_item_circle:I

    .line 86
    .line 87
    :goto_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-static {v6, v5, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    sget v6, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_view:I

    .line 96
    .line 97
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 102
    .line 103
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 108
    .line 109
    iput v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 110
    .line 111
    iput v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 112
    .line 113
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6, v4}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 117
    .line 118
    .line 119
    iget-object v7, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j:Landroid/widget/LinearLayout;

    .line 120
    .line 121
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    new-instance v5, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$h;

    .line 125
    .line 126
    invoke-direct {v5, p0, v6, v4}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$h;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;Lcom/jaredrummler/android/colorpicker/ColorPanelView;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 130
    .line 131
    .line 132
    new-instance v4, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;

    .line 133
    .line 134
    invoke-direct {v4, p0, v6}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$i;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;Lcom/jaredrummler/android/colorpicker/ColorPanelView;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    .line 139
    .line 140
    new-instance v4, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$j;

    .line 141
    .line 142
    invoke-direct {v4, p0, v6}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$j;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;Lcom/jaredrummler/android/colorpicker/ColorPanelView;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 146
    .line 147
    .line 148
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    return-void
.end method

.method public j()Landroid/view/View;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_dialog_color_picker:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_picker_view:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    .line 21
    .line 22
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_old:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 29
    .line 30
    sget v2, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_new:I

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 37
    .line 38
    iput-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->n:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 39
    .line 40
    sget v2, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_arrow_right:I

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Landroid/widget/ImageView;

    .line 47
    .line 48
    sget v3, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_hex:I

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Landroid/widget/EditText;

    .line 55
    .line 56
    iput-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    :try_start_0
    new-instance v4, Landroid/util/TypedValue;

    .line 60
    .line 61
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    iget v4, v4, Landroid/util/TypedValue;->data:I

    .line 69
    .line 70
    const v6, 0x1010036

    .line 71
    .line 72
    .line 73
    filled-new-array {v6}, [I

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v5, v4, v6}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const/high16 v5, -0x1000000

    .line 82
    .line 83
    invoke-virtual {v4, v3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setColorFilter(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    :catch_0
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    .line 94
    .line 95
    iget-boolean v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p:Z

    .line 96
    .line 97
    invoke-virtual {v2, v4}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->setAlphaSliderVisible(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const-string v4, "color"

    .line 105
    .line 106
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {v1, v2}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    .line 114
    .line 115
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    invoke-virtual {v1, v2, v4}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n(IZ)V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->n:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 122
    .line 123
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 126
    .line 127
    .line 128
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->t(I)V

    .line 131
    .line 132
    .line 133
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p:Z

    .line 134
    .line 135
    if-nez v1, :cond_0

    .line 136
    .line 137
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 138
    .line 139
    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    .line 140
    .line 141
    const/4 v5, 0x6

    .line 142
    invoke-direct {v2, v5}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 143
    .line 144
    .line 145
    new-array v4, v4, [Landroid/text/InputFilter;

    .line 146
    .line 147
    aput-object v2, v4, v3

    .line 148
    .line 149
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 150
    .line 151
    .line 152
    :cond_0
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->n:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 153
    .line 154
    new-instance v2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$e;

    .line 155
    .line 156
    invoke-direct {v2, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$e;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->t:Landroid/view/View$OnTouchListener;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    .line 168
    .line 169
    invoke-virtual {v1, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->setOnColorChangedListener(Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;)V

    .line 170
    .line 171
    .line 172
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 173
    .line 174
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 175
    .line 176
    .line 177
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 178
    .line 179
    new-instance v2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$f;

    .line 180
    .line 181
    invoke-direct {v2, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$f;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 185
    .line 186
    .line 187
    return-object v0
.end method

.method public k()Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/jaredrummler/android/colorpicker/R$layout;->cpv_dialog_presets:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->shades_layout:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/widget/LinearLayout;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j:Landroid/widget/LinearLayout;

    .line 21
    .line 22
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->transparency_seekbar:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroid/widget/SeekBar;

    .line 29
    .line 30
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->k:Landroid/widget/SeekBar;

    .line 31
    .line 32
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->transparency_text:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/widget/TextView;

    .line 39
    .line 40
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->l:Landroid/widget/TextView;

    .line 41
    .line 42
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->gridView:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Landroid/widget/GridView;

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m()V

    .line 51
    .line 52
    .line 53
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g:Z

    .line 54
    .line 55
    const/16 v3, 0x8

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->i(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    sget v2, Lcom/jaredrummler/android/colorpicker/R$id;->shades_divider:I

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    :goto_0
    new-instance v2, Lcom/jaredrummler/android/colorpicker/a;

    .line 80
    .line 81
    new-instance v4, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$g;

    .line 82
    .line 83
    invoke-direct {v4, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$g;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V

    .line 84
    .line 85
    .line 86
    iget-object v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 87
    .line 88
    invoke-direct {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->getSelectedItemPosition()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    iget v7, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h:I

    .line 93
    .line 94
    invoke-direct {v2, v4, v5, v6, v7}, Lcom/jaredrummler/android/colorpicker/a;-><init>(Lcom/jaredrummler/android/colorpicker/a$a;[III)V

    .line 95
    .line 96
    .line 97
    iput-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->i:Lcom/jaredrummler/android/colorpicker/a;

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 100
    .line 101
    .line 102
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p:Z

    .line 103
    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->u()V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_1
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->transparency_layout:I

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    .line 119
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->transparency_title:I

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    return-object v0
.end method

.method public final l(I)[I
    .locals 14

    .line 1
    const-wide v0, 0x3feccccccccccccdL    # 0.9

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const-wide v0, 0x3fe6666666666666L    # 0.7

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const-wide v0, 0x3fd54fdf3b645a1dL    # 0.333

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const-wide v0, 0x3fc53f7ced916873L    # 0.166

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const-wide/high16 v0, -0x4040000000000000L    # -0.125

    .line 44
    .line 45
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    const-wide/high16 v0, -0x4030000000000000L    # -0.25

    .line 50
    .line 51
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    const-wide/high16 v0, -0x4028000000000000L    # -0.375

    .line 56
    .line 57
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    const-wide/high16 v0, -0x4020000000000000L    # -0.5

    .line 62
    .line 63
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    const-wide v0, -0x401a666666666666L    # -0.675

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    const-wide v0, -0x401999999999999aL    # -0.7

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    const-wide v0, -0x4017333333333333L    # -0.775

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->v(ID)I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    filled-new-array/range {v2 .. v13}, [I

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1
.end method

.method public final m()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "presets"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    sget-object v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->u:[I

    .line 22
    .line 23
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 26
    .line 27
    sget-object v2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->u:[I

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v2, v3

    .line 35
    :goto_0
    array-length v4, v1

    .line 36
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 41
    .line 42
    const/16 v1, 0xff

    .line 43
    .line 44
    if-eq v0, v1, :cond_2

    .line 45
    .line 46
    move v1, v3

    .line 47
    :goto_1
    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 48
    .line 49
    array-length v5, v4

    .line 50
    if-ge v1, v5, :cond_2

    .line 51
    .line 52
    aget v4, v4, v1

    .line 53
    .line 54
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget-object v7, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 67
    .line 68
    invoke-static {v0, v5, v6, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    aput v4, v7, v1

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 78
    .line 79
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 80
    .line 81
    invoke-virtual {p0, v1, v4}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->w([II)[I

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v4, "color"

    .line 92
    .line 93
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 98
    .line 99
    if-eq v1, v4, :cond_3

    .line 100
    .line 101
    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 102
    .line 103
    invoke-virtual {p0, v4, v1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->w([II)[I

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 108
    .line 109
    :cond_3
    if-eqz v2, :cond_4

    .line 110
    .line 111
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 112
    .line 113
    array-length v2, v1

    .line 114
    const/16 v4, 0x13

    .line 115
    .line 116
    if-ne v2, v4, :cond_4

    .line 117
    .line 118
    invoke-static {v0, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-virtual {p0, v1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->r([II)[I

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->c:[I

    .line 127
    .line 128
    :cond_4
    return-void
.end method

.method public final o(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->a:Le1/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "ColorPickerDialog"

    .line 6
    .line 7
    const-string v1, "Using deprecated listener which may be remove in future releases"

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->a:Le1/b;

    .line 13
    .line 14
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f:I

    .line 15
    .line 16
    invoke-interface {v0, v1, p1}, Le1/b;->a(II)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Le1/b;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Le1/b;

    .line 29
    .line 30
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f:I

    .line 31
    .line 32
    invoke-interface {v0, v1, p1}, Le1/b;->a(II)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "The activity must implement ColorPickerDialogListener"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "id"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "alpha"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p:Z

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "showColorShades"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g:Z

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "colorShape"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h:I

    .line 48
    .line 49
    const-string v0, "dialogType"

    .line 50
    .line 51
    const-string v1, "color"

    .line 52
    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 87
    .line 88
    :goto_0
    new-instance p1, Landroid/widget/FrameLayout;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-direct {p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->b:Landroid/widget/FrameLayout;

    .line 98
    .line 99
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    if-nez v0, :cond_1

    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j()Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    if-ne v0, v1, :cond_2

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->k()Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    const-string v0, "selectedButtonText"

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_3

    .line 132
    .line 133
    sget p1, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_select:I

    .line 134
    .line 135
    :cond_3
    new-instance v0, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 136
    .line 137
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v0, v2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->b:Landroid/widget/FrameLayout;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    new-instance v2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$c;

    .line 151
    .line 152
    invoke-direct {v2, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$c;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, p1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const-string v2, "dialogTitle"

    .line 164
    .line 165
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_4

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 172
    .line 173
    .line 174
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const-string v2, "presetsButtonText"

    .line 179
    .line 180
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->q:I

    .line 185
    .line 186
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const-string v2, "customButtonText"

    .line 191
    .line 192
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->s:I

    .line 197
    .line 198
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 199
    .line 200
    if-nez v0, :cond_6

    .line 201
    .line 202
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-string v2, "allowPresets"

    .line 207
    .line 208
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_6

    .line 213
    .line 214
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->q:I

    .line 215
    .line 216
    if-eqz v0, :cond_5

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_5
    sget v0, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_presets:I

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_6
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 223
    .line 224
    if-ne v0, v1, :cond_8

    .line 225
    .line 226
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    const-string v1, "allowCustom"

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_8

    .line 237
    .line 238
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->s:I

    .line 239
    .line 240
    if-eqz v0, :cond_7

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_7
    sget v0, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_custom:I

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_8
    const/4 v0, 0x0

    .line 247
    :goto_2
    if-eqz v0, :cond_9

    .line 248
    .line 249
    const/4 v1, 0x0

    .line 250
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 251
    .line 252
    .line 253
    :cond_9
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    return-object p1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "color"

    .line 2
    .line 3
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "dialogType"

    .line 9
    .line 10
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->e:I

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/app/AlertDialog;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x20008

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x4

    .line 25
    invoke-virtual {v1, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 26
    .line 27
    .line 28
    const/4 v1, -0x3

    .line 29
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$d;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->a:Le1/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "ColorPickerDialog"

    .line 6
    .line 7
    const-string v1, "Using deprecated listener which may be remove in future releases"

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->a:Le1/b;

    .line 13
    .line 14
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f:I

    .line 15
    .line 16
    invoke-interface {v0, v1}, Le1/b;->b(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Le1/b;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Le1/b;

    .line 29
    .line 30
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->f:I

    .line 31
    .line 32
    invoke-interface {v0, v1}, Le1/b;->b(I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final q(Ljava/lang/String;)I
    .locals 10

    .line 1
    const-string v0, "#"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v2, 0xff

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    move p1, v3

    .line 24
    move v0, p1

    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v4, 0x2

    .line 32
    const/16 v5, 0x10

    .line 33
    .line 34
    if-gt v0, v4, :cond_2

    .line 35
    .line 36
    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    move v0, v3

    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v6, 0x3

    .line 48
    if-ne v0, v6, :cond_3

    .line 49
    .line 50
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {p1, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v7, 0x4

    .line 81
    if-ne v0, v7, :cond_4

    .line 82
    .line 83
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {p1, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    goto/16 :goto_0

    .line 100
    .line 101
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    const/4 v8, 0x5

    .line 106
    if-ne v0, v8, :cond_5

    .line 107
    .line 108
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {p1, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-virtual {p1, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    const/4 v9, 0x6

    .line 139
    if-ne v0, v9, :cond_6

    .line 140
    .line 141
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-virtual {p1, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {p1, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    goto :goto_0

    .line 166
    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    const/4 v2, 0x7

    .line 171
    if-ne v0, v2, :cond_7

    .line 172
    .line 173
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    invoke-virtual {p1, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-static {v1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    invoke-virtual {p1, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    invoke-virtual {p1, v8, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    move v2, v0

    .line 206
    move v0, v1

    .line 207
    goto :goto_0

    .line 208
    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    const/16 v1, 0x8

    .line 213
    .line 214
    if-ne v0, v1, :cond_8

    .line 215
    .line 216
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    invoke-virtual {p1, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-virtual {p1, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    invoke-virtual {p1, v9, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-static {p1, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    goto :goto_0

    .line 249
    :cond_8
    const/4 v2, -0x1

    .line 250
    move p1, v2

    .line 251
    move v0, p1

    .line 252
    move v3, v0

    .line 253
    :goto_0
    invoke-static {v2, v3, v0, p1}, Landroid/graphics/Color;->argb(IIII)I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    return p1
.end method

.method public final r([II)[I
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p1, v2

    .line 7
    .line 8
    if-ne v3, p2, :cond_0

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    array-length v0, p1

    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    new-array v2, v2, [I

    .line 18
    .line 19
    aput p2, v2, v0

    .line 20
    .line 21
    invoke-static {p1, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    return-object v2
.end method

.method public s(Le1/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->a:Le1/b;

    .line 2
    .line 3
    return-void
.end method

.method public final t(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v1, "%08X"

    .line 16
    .line 17
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/EditText;

    .line 26
    .line 27
    const v1, 0xffffff

    .line 28
    .line 29
    .line 30
    and-int/2addr p1, v1

    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v1, "%06X"

    .line 40
    .line 41
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final u()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xff

    .line 8
    .line 9
    rsub-int v0, v0, 0xff

    .line 10
    .line 11
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->k:Landroid/widget/SeekBar;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->k:Landroid/widget/SeekBar;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 19
    .line 20
    .line 21
    int-to-double v0, v0

    .line 22
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 23
    .line 24
    mul-double/2addr v0, v2

    .line 25
    const-wide v2, 0x406fe00000000000L    # 255.0

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    div-double/2addr v0, v2

    .line 31
    double-to-int v0, v0

    .line 32
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->l:Landroid/widget/TextView;

    .line 33
    .line 34
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v3, "%d%%"

    .line 45
    .line 46
    invoke-static {v2, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->k:Landroid/widget/SeekBar;

    .line 54
    .line 55
    new-instance v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final v(ID)I
    .locals 10

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p1

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "#%06X"

    .line 14
    .line 15
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmpg-double v0, p2, v4

    .line 33
    .line 34
    if-gez v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-wide v4, 0x406fe00000000000L    # 255.0

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :goto_0
    if-gez v0, :cond_1

    .line 43
    .line 44
    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    .line 45
    .line 46
    mul-double/2addr p2, v6

    .line 47
    :cond_1
    shr-long v0, v2, v1

    .line 48
    .line 49
    const/16 v6, 0x8

    .line 50
    .line 51
    shr-long v6, v2, v6

    .line 52
    .line 53
    const-wide/16 v8, 0xff

    .line 54
    .line 55
    and-long/2addr v6, v8

    .line 56
    and-long/2addr v2, v8

    .line 57
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    long-to-double v8, v0

    .line 62
    sub-double v8, v4, v8

    .line 63
    .line 64
    mul-double/2addr v8, p2

    .line 65
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    .line 66
    .line 67
    .line 68
    move-result-wide v8

    .line 69
    add-long/2addr v8, v0

    .line 70
    long-to-int v0, v8

    .line 71
    long-to-double v8, v6

    .line 72
    sub-double v8, v4, v8

    .line 73
    .line 74
    mul-double/2addr v8, p2

    .line 75
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    .line 76
    .line 77
    .line 78
    move-result-wide v8

    .line 79
    add-long/2addr v8, v6

    .line 80
    long-to-int v1, v8

    .line 81
    long-to-double v6, v2

    .line 82
    sub-double/2addr v4, v6

    .line 83
    mul-double/2addr v4, p2

    .line 84
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 85
    .line 86
    .line 87
    move-result-wide p2

    .line 88
    add-long/2addr p2, v2

    .line 89
    long-to-int p2, p2

    .line 90
    invoke-static {p1, v0, v1, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    return p1
.end method

.method public final w([II)[I
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p1, v2

    .line 7
    .line 8
    if-ne v3, p2, :cond_0

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    array-length v0, p1

    .line 15
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    new-array v2, v2, [I

    .line 18
    .line 19
    aput p2, v2, v1

    .line 20
    .line 21
    const/4 p2, 0x1

    .line 22
    invoke-static {p1, v1, v2, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    return-object v2
.end method
