.class public La/b/h/u;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:La/b/h/s0;

.field public c:La/b/h/s0;

.field public d:La/b/h/s0;

.field public e:La/b/h/s0;

.field public f:La/b/h/s0;

.field public g:La/b/h/s0;

.field public h:La/b/h/s0;

.field public final i:La/b/h/x;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La/b/h/u;->j:I

    const/4 v0, -0x1

    iput v0, p0, La/b/h/u;->k:I

    iput-object p1, p0, La/b/h/u;->a:Landroid/widget/TextView;

    new-instance v0, La/b/h/x;

    invoke-direct {v0, p1}, La/b/h/x;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, La/b/h/u;->i:La/b/h/x;

    return-void
.end method

.method public static c(Landroid/content/Context;La/b/h/i;I)La/b/h/s0;
    .locals 0

    invoke-virtual {p1, p0, p2}, La/b/h/i;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, La/b/h/s0;

    invoke-direct {p1}, La/b/h/s0;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, La/b/h/s0;->d:Z

    iput-object p0, p1, La/b/h/s0;->a:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;La/b/h/s0;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, La/b/h/i;->f(Landroid/graphics/drawable/Drawable;La/b/h/s0;[I)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, La/b/h/u;->b:La/b/h/s0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, La/b/h/u;->c:La/b/h/s0;

    if-nez v0, :cond_0

    iget-object v0, p0, La/b/h/u;->d:La/b/h/s0;

    if-nez v0, :cond_0

    iget-object v0, p0, La/b/h/u;->e:La/b/h/s0;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, La/b/h/u;->b:La/b/h/s0;

    invoke-virtual {p0, v3, v4}, La/b/h/u;->a(Landroid/graphics/drawable/Drawable;La/b/h/s0;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, La/b/h/u;->c:La/b/h/s0;

    invoke-virtual {p0, v3, v4}, La/b/h/u;->a(Landroid/graphics/drawable/Drawable;La/b/h/s0;)V

    aget-object v3, v0, v1

    iget-object v4, p0, La/b/h/u;->d:La/b/h/s0;

    invoke-virtual {p0, v3, v4}, La/b/h/u;->a(Landroid/graphics/drawable/Drawable;La/b/h/s0;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, La/b/h/u;->e:La/b/h/s0;

    invoke-virtual {p0, v0, v3}, La/b/h/u;->a(Landroid/graphics/drawable/Drawable;La/b/h/s0;)V

    :cond_1
    iget-object v0, p0, La/b/h/u;->f:La/b/h/s0;

    if-nez v0, :cond_2

    iget-object v0, p0, La/b/h/u;->g:La/b/h/s0;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, La/b/h/u;->f:La/b/h/s0;

    invoke-virtual {p0, v2, v3}, La/b/h/u;->a(Landroid/graphics/drawable/Drawable;La/b/h/s0;)V

    aget-object v0, v0, v1

    iget-object v1, p0, La/b/h/u;->g:La/b/h/s0;

    invoke-virtual {p0, v0, v1}, La/b/h/u;->a(Landroid/graphics/drawable/Drawable;La/b/h/s0;)V

    :cond_3
    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, La/b/h/u;->i:La/b/h/x;

    .line 1
    invoke-virtual {v0}, La/b/h/x;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v0, v0, La/b/h/x;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Landroid/util/AttributeSet;I)V
    .locals 24
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v9, p2

    sget-object v10, La/b/b;->i:[I

    sget-object v11, La/b/b;->v:[I

    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-static {}, La/b/h/i;->a()La/b/h/i;

    move-result-object v14

    sget-object v3, La/b/b;->h:[I

    const/4 v15, 0x0

    invoke-static {v13, v8, v3, v9, v15}, La/b/h/u0;->q(Landroid/content/Context;Landroid/util/AttributeSet;[III)La/b/h/u0;

    move-result-object v7

    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 1
    iget-object v5, v7, La/b/h/u0;->b:Landroid/content/res/TypedArray;

    const/16 v16, 0x0

    move-object/from16 v4, p1

    move/from16 v6, p2

    move-object v15, v7

    move/from16 v7, v16

    .line 2
    invoke-static/range {v1 .. v7}, La/h/j/o;->m(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    const/4 v7, -0x1

    const/4 v1, 0x0

    invoke-virtual {v15, v1, v7}, La/b/h/u0;->l(II)I

    move-result v2

    const/4 v6, 0x3

    invoke-virtual {v15, v6}, La/b/h/u0;->o(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v15, v6, v1}, La/b/h/u0;->l(II)I

    move-result v3

    invoke-static {v13, v14, v3}, La/b/h/u;->c(Landroid/content/Context;La/b/h/i;I)La/b/h/s0;

    move-result-object v3

    iput-object v3, v0, La/b/h/u;->b:La/b/h/s0;

    :cond_0
    const/4 v5, 0x1

    invoke-virtual {v15, v5}, La/b/h/u0;->o(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v15, v5, v1}, La/b/h/u0;->l(II)I

    move-result v3

    invoke-static {v13, v14, v3}, La/b/h/u;->c(Landroid/content/Context;La/b/h/i;I)La/b/h/s0;

    move-result-object v3

    iput-object v3, v0, La/b/h/u;->c:La/b/h/s0;

    :cond_1
    const/4 v4, 0x4

    invoke-virtual {v15, v4}, La/b/h/u0;->o(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v15, v4, v1}, La/b/h/u0;->l(II)I

    move-result v3

    invoke-static {v13, v14, v3}, La/b/h/u;->c(Landroid/content/Context;La/b/h/i;I)La/b/h/s0;

    move-result-object v3

    iput-object v3, v0, La/b/h/u;->d:La/b/h/s0;

    :cond_2
    const/4 v3, 0x2

    invoke-virtual {v15, v3}, La/b/h/u0;->o(I)Z

    move-result v16

    if-eqz v16, :cond_3

    invoke-virtual {v15, v3, v1}, La/b/h/u0;->l(II)I

    move-result v4

    invoke-static {v13, v14, v4}, La/b/h/u;->c(Landroid/content/Context;La/b/h/i;I)La/b/h/s0;

    move-result-object v4

    iput-object v4, v0, La/b/h/u;->e:La/b/h/s0;

    :cond_3
    const/4 v4, 0x5

    invoke-virtual {v15, v4}, La/b/h/u0;->o(I)Z

    move-result v17

    if-eqz v17, :cond_4

    invoke-virtual {v15, v4, v1}, La/b/h/u0;->l(II)I

    move-result v3

    invoke-static {v13, v14, v3}, La/b/h/u;->c(Landroid/content/Context;La/b/h/i;I)La/b/h/s0;

    move-result-object v3

    iput-object v3, v0, La/b/h/u;->f:La/b/h/s0;

    :cond_4
    const/4 v3, 0x6

    invoke-virtual {v15, v3}, La/b/h/u0;->o(I)Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-virtual {v15, v3, v1}, La/b/h/u0;->l(II)I

    move-result v4

    invoke-static {v13, v14, v4}, La/b/h/u;->c(Landroid/content/Context;La/b/h/i;I)La/b/h/s0;

    move-result-object v1

    iput-object v1, v0, La/b/h/u;->g:La/b/h/s0;

    .line 3
    :cond_5
    iget-object v1, v15, La/b/h/u0;->b:Landroid/content/res/TypedArray;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v1

    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    const/16 v4, 0xe

    if-eq v2, v7, :cond_9

    .line 5
    new-instance v3, La/b/h/u0;

    invoke-virtual {v13, v2, v11}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-direct {v3, v13, v2}, La/b/h/u0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v1, :cond_6

    .line 6
    invoke-virtual {v3, v4}, La/b/h/u0;->o(I)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, 0x0

    invoke-virtual {v3, v4, v2}, La/b/h/u0;->a(IZ)Z

    move-result v21

    move v2, v5

    goto :goto_0

    :cond_6
    const/4 v2, 0x0

    const/16 v21, 0x0

    :goto_0
    invoke-virtual {v0, v13, v3}, La/b/h/u;->m(Landroid/content/Context;La/b/h/u0;)V

    const/16 v5, 0xf

    invoke-virtual {v3, v5}, La/b/h/u0;->o(I)Z

    move-result v19

    if-eqz v19, :cond_7

    invoke-virtual {v3, v5}, La/b/h/u0;->m(I)Ljava/lang/String;

    move-result-object v22

    const/16 v5, 0x1a

    goto :goto_1

    :cond_7
    const/16 v5, 0x1a

    const/16 v22, 0x0

    :goto_1
    if-lt v12, v5, :cond_8

    const/16 v5, 0xd

    invoke-virtual {v3, v5}, La/b/h/u0;->o(I)Z

    move-result v20

    if-eqz v20, :cond_8

    invoke-virtual {v3, v5}, La/b/h/u0;->m(I)Ljava/lang/String;

    move-result-object v23

    goto :goto_2

    :cond_8
    const/16 v23, 0x0

    .line 7
    :goto_2
    iget-object v3, v3, La/b/h/u0;->b:Landroid/content/res/TypedArray;

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    .line 8
    :goto_3
    new-instance v3, La/b/h/u0;

    const/4 v5, 0x0

    invoke-virtual {v13, v8, v11, v9, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v11

    invoke-direct {v3, v13, v11}, La/b/h/u0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v1, :cond_a

    .line 9
    invoke-virtual {v3, v4}, La/b/h/u0;->o(I)Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-virtual {v3, v4, v5}, La/b/h/u0;->a(IZ)Z

    move-result v21

    move/from16 v5, v21

    const/4 v2, 0x1

    goto :goto_4

    :cond_a
    move/from16 v5, v21

    :goto_4
    const/16 v11, 0xf

    invoke-virtual {v3, v11}, La/b/h/u0;->o(I)Z

    move-result v19

    if-eqz v19, :cond_b

    invoke-virtual {v3, v11}, La/b/h/u0;->m(I)Ljava/lang/String;

    move-result-object v22

    :cond_b
    move-object/from16 v11, v22

    const/16 v4, 0x1a

    if-lt v12, v4, :cond_c

    const/16 v4, 0xd

    invoke-virtual {v3, v4}, La/b/h/u0;->o(I)Z

    move-result v19

    if-eqz v19, :cond_c

    invoke-virtual {v3, v4}, La/b/h/u0;->m(I)Ljava/lang/String;

    move-result-object v23

    :cond_c
    move-object/from16 v4, v23

    const/16 v6, 0x1c

    if-lt v12, v6, :cond_d

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, La/b/h/u0;->o(I)Z

    move-result v17

    if-eqz v17, :cond_d

    invoke-virtual {v3, v6, v7}, La/b/h/u0;->f(II)I

    move-result v17

    if-nez v17, :cond_d

    iget-object v15, v0, La/b/h/u;->a:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v15, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_d
    invoke-virtual {v0, v13, v3}, La/b/h/u;->m(Landroid/content/Context;La/b/h/u0;)V

    .line 10
    iget-object v3, v3, La/b/h/u0;->b:Landroid/content/res/TypedArray;

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v1, :cond_e

    if-eqz v2, :cond_e

    .line 11
    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 12
    :cond_e
    iget-object v1, v0, La/b/h/u;->l:Landroid/graphics/Typeface;

    if-eqz v1, :cond_10

    iget v2, v0, La/b/h/u;->k:I

    const/4 v7, -0x1

    if-ne v2, v7, :cond_f

    iget-object v2, v0, La/b/h/u;->a:Landroid/widget/TextView;

    iget v3, v0, La/b/h/u;->j:I

    invoke-virtual {v2, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_5

    :cond_f
    iget-object v2, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_5

    :cond_10
    const/4 v7, -0x1

    :goto_5
    if-eqz v4, :cond_11

    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    :cond_11
    const/16 v15, 0x18

    if-eqz v11, :cond_13

    if-lt v12, v15, :cond_12

    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-static {v11}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextLocales(Landroid/os/LocaleList;)V

    goto :goto_6

    :cond_12
    const/16 v1, 0x2c

    invoke-virtual {v11, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v11, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-static {v1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextLocale(Ljava/util/Locale;)V

    goto :goto_7

    :cond_13
    :goto_6
    const/4 v2, 0x0

    :goto_7
    iget-object v11, v0, La/b/h/u;->i:La/b/h/x;

    .line 13
    iget-object v1, v11, La/b/h/x;->j:Landroid/content/Context;

    invoke-virtual {v1, v8, v10, v9, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    iget-object v1, v11, La/b/h/x;->i:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/16 v22, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x6

    move-object v3, v10

    const/4 v15, 0x5

    move-object/from16 v4, p1

    move-object v5, v6

    move-object v15, v6

    const/4 v9, 0x3

    move/from16 v6, p2

    move/from16 v7, v22

    invoke-static/range {v1 .. v7}, La/h/j/o;->m(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    const/4 v1, 0x5

    invoke-virtual {v15, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_14

    const/4 v2, 0x0

    invoke-virtual {v15, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, v11, La/b/h/x;->a:I

    :cond_14
    const/4 v1, 0x4

    invoke-virtual {v15, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    const/high16 v3, -0x40800000    # -1.0f

    if-eqz v2, :cond_15

    invoke-virtual {v15, v1, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    goto :goto_8

    :cond_15
    move v1, v3

    :goto_8
    const/4 v2, 0x2

    invoke-virtual {v15, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-virtual {v15, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    goto :goto_9

    :cond_16
    move v4, v3

    :goto_9
    const/4 v5, 0x1

    invoke-virtual {v15, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-virtual {v15, v5, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    goto :goto_a

    :cond_17
    move v6, v3

    :goto_a
    invoke-virtual {v15, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    const/4 v7, 0x0

    invoke-virtual {v15, v9, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-lez v2, :cond_1a

    invoke-virtual {v15}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 14
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->length()I

    move-result v7

    new-array v9, v7, [I

    if-lez v7, :cond_19

    const/4 v3, 0x0

    :goto_b
    const/4 v5, -0x1

    if-ge v3, v7, :cond_18

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v18

    aput v18, v9, v3

    add-int/lit8 v3, v3, 0x1

    const/4 v5, 0x1

    goto :goto_b

    :cond_18
    invoke-virtual {v11, v9}, La/b/h/x;->b([I)[I

    move-result-object v3

    iput-object v3, v11, La/b/h/x;->f:[I

    invoke-virtual {v11}, La/b/h/x;->h()Z

    goto :goto_c

    :cond_19
    const/4 v5, -0x1

    .line 15
    :goto_c
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_d

    :cond_1a
    const/4 v5, -0x1

    :goto_d
    invoke-virtual {v15}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v11}, La/b/h/x;->i()Z

    move-result v2

    if-eqz v2, :cond_1f

    iget v2, v11, La/b/h/x;->a:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_20

    iget-boolean v2, v11, La/b/h/x;->g:Z

    if-nez v2, :cond_1e

    iget-object v2, v11, La/b/h/x;->j:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v7, v4, v3

    if-nez v7, :cond_1b

    const/high16 v4, 0x41400000    # 12.0f

    const/4 v7, 0x2

    invoke-static {v7, v4, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    goto :goto_e

    :cond_1b
    const/4 v7, 0x2

    :goto_e
    cmpl-float v9, v6, v3

    if-nez v9, :cond_1c

    const/high16 v6, 0x42e00000    # 112.0f

    invoke-static {v7, v6, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v6

    :cond_1c
    cmpl-float v2, v1, v3

    if-nez v2, :cond_1d

    const/high16 v1, 0x3f800000    # 1.0f

    :cond_1d
    invoke-virtual {v11, v4, v6, v1}, La/b/h/x;->j(FFF)V

    :cond_1e
    invoke-virtual {v11}, La/b/h/x;->g()Z

    goto :goto_f

    :cond_1f
    const/4 v1, 0x0

    iput v1, v11, La/b/h/x;->a:I

    .line 16
    :cond_20
    :goto_f
    sget-boolean v1, La/h/k/b;->a:Z

    if-eqz v1, :cond_22

    iget-object v1, v0, La/b/h/u;->i:La/b/h/x;

    .line 17
    iget v2, v1, La/b/h/x;->a:I

    if-eqz v2, :cond_22

    .line 18
    iget-object v1, v1, La/b/h/x;->f:[I

    .line 19
    array-length v2, v1

    if-lez v2, :cond_22

    iget-object v2, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_21

    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    iget-object v2, v0, La/b/h/u;->i:La/b/h/x;

    .line 20
    iget v2, v2, La/b/h/x;->d:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 21
    iget-object v3, v0, La/b/h/u;->i:La/b/h/x;

    .line 22
    iget v3, v3, La/b/h/x;->e:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 23
    iget-object v4, v0, La/b/h/u;->i:La/b/h/x;

    .line 24
    iget v4, v4, La/b/h/x;->c:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    const/4 v6, 0x0

    .line 25
    invoke-virtual {v1, v2, v3, v4, v6}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_10

    :cond_21
    const/4 v6, 0x0

    iget-object v2, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v1, v6}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    .line 26
    :cond_22
    :goto_10
    invoke-virtual {v13, v8, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/16 v2, 0x8

    .line 27
    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, v5, :cond_23

    .line 28
    invoke-virtual {v14, v13, v2}, La/b/h/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_11

    :cond_23
    const/4 v2, 0x0

    :goto_11
    const/16 v3, 0xd

    .line 29
    invoke-virtual {v1, v3, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eq v3, v5, :cond_24

    .line 30
    invoke-virtual {v14, v13, v3}, La/b/h/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_12

    :cond_24
    const/4 v3, 0x0

    :goto_12
    const/16 v4, 0x9

    .line 31
    invoke-virtual {v1, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eq v4, v5, :cond_25

    .line 32
    invoke-virtual {v14, v13, v4}, La/b/h/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_13

    :cond_25
    const/4 v4, 0x0

    :goto_13
    const/4 v6, 0x6

    .line 33
    invoke-virtual {v1, v6, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    if-eq v6, v5, :cond_26

    .line 34
    invoke-virtual {v14, v13, v6}, La/b/h/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    goto :goto_14

    :cond_26
    const/4 v6, 0x0

    :goto_14
    const/16 v7, 0xa

    .line 35
    invoke-virtual {v1, v7, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    if-eq v7, v5, :cond_27

    .line 36
    invoke-virtual {v14, v13, v7}, La/b/h/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_15

    :cond_27
    const/4 v7, 0x0

    :goto_15
    const/4 v8, 0x7

    .line 37
    invoke-virtual {v1, v8, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    if-eq v8, v5, :cond_28

    .line 38
    invoke-virtual {v14, v13, v8}, La/b/h/i;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_16

    :cond_28
    const/4 v8, 0x0

    :goto_16
    if-nez v7, :cond_33

    if-eqz v8, :cond_29

    goto :goto_1e

    :cond_29
    if-nez v2, :cond_2a

    if-nez v3, :cond_2a

    if-nez v4, :cond_2a

    if-eqz v6, :cond_38

    .line 39
    :cond_2a
    iget-object v7, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v7

    const/4 v8, 0x0

    aget-object v9, v7, v8

    if-nez v9, :cond_30

    const/4 v9, 0x2

    aget-object v10, v7, v9

    if-eqz v10, :cond_2b

    goto :goto_1b

    :cond_2b
    iget-object v7, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v7

    iget-object v9, v0, La/b/h/u;->a:Landroid/widget/TextView;

    if-eqz v2, :cond_2c

    goto :goto_17

    :cond_2c
    aget-object v2, v7, v8

    :goto_17
    if-eqz v3, :cond_2d

    goto :goto_18

    :cond_2d
    const/4 v3, 0x1

    aget-object v3, v7, v3

    :goto_18
    if-eqz v4, :cond_2e

    goto :goto_19

    :cond_2e
    const/4 v4, 0x2

    aget-object v4, v7, v4

    :goto_19
    if-eqz v6, :cond_2f

    goto :goto_1a

    :cond_2f
    const/4 v6, 0x3

    aget-object v6, v7, v6

    :goto_1a
    invoke-virtual {v9, v2, v3, v4, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_23

    :cond_30
    :goto_1b
    iget-object v2, v0, La/b/h/u;->a:Landroid/widget/TextView;

    const/4 v4, 0x0

    aget-object v8, v7, v4

    if-eqz v3, :cond_31

    goto :goto_1c

    :cond_31
    const/4 v3, 0x1

    aget-object v3, v7, v3

    :goto_1c
    const/4 v4, 0x2

    aget-object v4, v7, v4

    if-eqz v6, :cond_32

    goto :goto_1d

    :cond_32
    const/4 v6, 0x3

    aget-object v6, v7, v6

    :goto_1d
    invoke-virtual {v2, v8, v3, v4, v6}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_23

    :cond_33
    :goto_1e
    iget-object v2, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v4, v0, La/b/h/u;->a:Landroid/widget/TextView;

    if-eqz v7, :cond_34

    goto :goto_1f

    :cond_34
    const/4 v7, 0x0

    aget-object v9, v2, v7

    move-object v7, v9

    :goto_1f
    if-eqz v3, :cond_35

    goto :goto_20

    :cond_35
    const/4 v3, 0x1

    aget-object v3, v2, v3

    :goto_20
    if-eqz v8, :cond_36

    goto :goto_21

    :cond_36
    const/4 v8, 0x2

    aget-object v8, v2, v8

    :goto_21
    if-eqz v6, :cond_37

    goto :goto_22

    :cond_37
    const/4 v6, 0x3

    aget-object v6, v2, v6

    :goto_22
    invoke-virtual {v4, v7, v3, v8, v6}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_38
    :goto_23
    const/16 v2, 0xb

    .line 40
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3b

    .line 41
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_39

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_39

    .line 42
    sget-object v4, La/b/d/a/a;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v13, v3}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_39

    goto :goto_24

    .line 43
    :cond_39
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    .line 44
    :goto_24
    iget-object v2, v0, La/b/h/u;->a:Landroid/widget/TextView;

    .line 45
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x18

    if-lt v12, v4, :cond_3a

    .line 46
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_25

    :cond_3a
    instance-of v4, v2, La/h/k/f;

    if-eqz v4, :cond_3b

    check-cast v2, La/h/k/f;

    invoke-interface {v2, v3}, La/h/k/f;->setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V

    :cond_3b
    :goto_25
    const/16 v2, 0xc

    .line 47
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3d

    .line 48
    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/4 v3, 0x0

    .line 49
    invoke-static {v2, v3}, La/b/h/b0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    iget-object v3, v0, La/b/h/u;->a:Landroid/widget/TextView;

    .line 50
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x18

    if-lt v12, v4, :cond_3c

    .line 51
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_26

    :cond_3c
    instance-of v4, v3, La/h/k/f;

    if-eqz v4, :cond_3d

    check-cast v3, La/h/k/f;

    invoke-interface {v3, v2}, La/h/k/f;->setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_3d
    :goto_26
    const/16 v2, 0xe

    .line 52
    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x11

    invoke-virtual {v1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    const/16 v4, 0x12

    invoke-virtual {v1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    .line 53
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eq v2, v5, :cond_3e

    .line 54
    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-static {v1, v2}, La/h/b/e;->J(Landroid/widget/TextView;I)V

    :cond_3e
    if-eq v3, v5, :cond_3f

    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-static {v1, v3}, La/h/b/e;->K(Landroid/widget/TextView;I)V

    :cond_3f
    if-eq v4, v5, :cond_40

    iget-object v1, v0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-static {v1, v4}, La/h/b/e;->L(Landroid/widget/TextView;I)V

    :cond_40
    return-void
.end method

.method public f(Landroid/content/Context;I)V
    .locals 4

    sget-object v0, La/b/b;->v:[I

    .line 1
    new-instance v1, La/b/h/u0;

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-direct {v1, p1, p2}, La/b/h/u0;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/16 p2, 0xe

    .line 2
    invoke-virtual {v1, p2}, La/b/h/u0;->o(I)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v1, p2, v2}, La/b/h/u0;->a(IZ)Z

    move-result p2

    .line 3
    iget-object v0, p0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 4
    :cond_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v2}, La/b/h/u0;->o(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    invoke-virtual {v1, v2, v0}, La/b/h/u0;->f(II)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/b/h/u;->a:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, v1}, La/b/h/u;->m(Landroid/content/Context;La/b/h/u0;)V

    const/16 p1, 0x1a

    if-lt p2, p1, :cond_2

    const/16 p1, 0xd

    invoke-virtual {v1, p1}, La/b/h/u0;->o(I)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v1, p1}, La/b/h/u0;->m(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p2, p0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setFontVariationSettings(Ljava/lang/String;)Z

    .line 5
    :cond_2
    iget-object p1, v1, La/b/h/u0;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    iget-object p1, p0, La/b/h/u;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget-object p2, p0, La/b/h/u;->a:Landroid/widget/TextView;

    iget v0, p0, La/b/h/u;->j:I

    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public g(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 11

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_e

    if-eqz p2, :cond_e

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    const/4 p2, 0x0

    if-lt v0, v1, :cond_0

    .line 1
    invoke-virtual {p3, p1, p2}, Landroid/view/inputmethod/EditorInfo;->setInitialSurroundingSubText(Ljava/lang/CharSequence;I)V

    goto/16 :goto_7

    .line 2
    :cond_0
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-lt v0, v1, :cond_1

    .line 3
    invoke-virtual {p3, p1, p2}, Landroid/view/inputmethod/EditorInfo;->setInitialSurroundingSubText(Ljava/lang/CharSequence;I)V

    goto/16 :goto_7

    .line 4
    :cond_1
    iget v0, p3, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget v1, p3, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    if-le v0, v1, :cond_2

    add-int/lit8 v2, v1, 0x0

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v0, 0x0

    :goto_0
    if-le v0, v1, :cond_3

    sub-int/2addr v0, p2

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v1, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v3, 0x0

    if-ltz v2, :cond_d

    if-le v0, v1, :cond_4

    goto/16 :goto_6

    :cond_4
    iget v4, p3, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit16 v4, v4, 0xfff

    const/16 v5, 0x81

    const/4 v6, 0x1

    if-eq v4, v5, :cond_6

    const/16 v5, 0xe1

    if-eq v4, v5, :cond_6

    const/16 v5, 0x12

    if-ne v4, v5, :cond_5

    goto :goto_2

    :cond_5
    move v4, p2

    goto :goto_3

    :cond_6
    :goto_2
    move v4, v6

    :goto_3
    if-eqz v4, :cond_7

    goto/16 :goto_6

    :cond_7
    const/16 v3, 0x800

    if-gt v1, v3, :cond_8

    invoke-static {p3, p1, v2, v0}, La/h/j/b0/a;->b(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto :goto_7

    :cond_8
    sub-int v1, v0, v2

    const/16 v3, 0x400

    if-le v1, v3, :cond_9

    move v3, p2

    goto :goto_4

    :cond_9
    move v3, v1

    .line 5
    :goto_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    sub-int/2addr v4, v0

    rsub-int v5, v3, 0x800

    const-wide v7, 0x3fe999999999999aL    # 0.8

    int-to-double v9, v5

    mul-double/2addr v9, v7

    double-to-int v7, v9

    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    sub-int v7, v5, v7

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int/2addr v5, v4

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v2, v5

    invoke-static {p1, v2, p2}, La/h/j/b0/a;->a(Ljava/lang/CharSequence;II)Z

    move-result v7

    if-eqz v7, :cond_a

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v5, v5, -0x1

    :cond_a
    add-int v7, v0, v4

    sub-int/2addr v7, v6

    invoke-static {p1, v7, v6}, La/h/j/b0/a;->a(Ljava/lang/CharSequence;II)Z

    move-result v7

    if-eqz v7, :cond_b

    add-int/lit8 v4, v4, -0x1

    :cond_b
    add-int v7, v5, v3

    add-int/2addr v7, v4

    if-eq v3, v1, :cond_c

    add-int v1, v2, v5

    invoke-interface {p1, v2, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    add-int/2addr v4, v0

    invoke-interface {p1, v0, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    aput-object v1, v0, p2

    aput-object p1, v0, v6

    invoke-static {v0}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_5

    :cond_c
    add-int/2addr v7, v2

    invoke-interface {p1, v2, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    :goto_5
    add-int/2addr v5, p2

    add-int/2addr v3, v5

    invoke-static {p3, p1, v5, v3}, La/h/j/b0/a;->b(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto :goto_7

    .line 6
    :cond_d
    :goto_6
    invoke-static {p3, v3, p2, p2}, La/h/j/b0/a;->b(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    :cond_e
    :goto_7
    return-void
.end method

.method public h(IIII)V
    .locals 2

    iget-object v0, p0, La/b/h/u;->i:La/b/h/x;

    .line 1
    invoke-virtual {v0}, La/b/h/x;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, La/b/h/x;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    int-to-float p1, p1

    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    int-to-float p2, p2

    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    int-to-float p3, p3

    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, La/b/h/x;->j(FFF)V

    invoke-virtual {v0}, La/b/h/x;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, La/b/h/x;->a()V

    :cond_0
    return-void
.end method

.method public i([II)V
    .locals 6

    iget-object v0, p0, La/b/h/u;->i:La/b/h/x;

    .line 1
    invoke-virtual {v0}, La/b/h/x;->i()Z

    move-result v1

    if-eqz v1, :cond_4

    array-length v1, p1

    const/4 v2, 0x0

    if-lez v1, :cond_3

    new-array v3, v1, [I

    if-nez p2, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    goto :goto_1

    :cond_0
    iget-object v4, v0, La/b/h/x;->j:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    :goto_0
    if-ge v2, v1, :cond_1

    aget v5, p1, v2

    int-to-float v5, v5

    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v0, v3}, La/b/h/x;->b([I)[I

    move-result-object p2

    iput-object p2, v0, La/b/h/x;->f:[I

    invoke-virtual {v0}, La/b/h/x;->h()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "None of the preset sizes is valid: "

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    iput-boolean v2, v0, La/b/h/x;->g:Z

    :goto_2
    invoke-virtual {v0}, La/b/h/x;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, La/b/h/x;->a()V

    :cond_4
    return-void
.end method

.method public j(I)V
    .locals 4

    iget-object v0, p0, La/b/h/u;->i:La/b/h/x;

    .line 1
    invoke-virtual {v0}, La/b/h/x;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    iget-object p1, v0, La/b/h/x;->j:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/high16 v1, 0x41400000    # 12.0f

    const/4 v2, 0x2

    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    const/high16 v3, 0x42e00000    # 112.0f

    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, p1, v2}, La/b/h/x;->j(FFF)V

    invoke-virtual {v0}, La/b/h/x;->g()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, La/b/h/x;->a()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown auto-size text type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p1, 0x0

    .line 2
    iput p1, v0, La/b/h/x;->a:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, La/b/h/x;->d:F

    iput v1, v0, La/b/h/x;->e:F

    iput v1, v0, La/b/h/x;->c:F

    new-array v1, p1, [I

    iput-object v1, v0, La/b/h/x;->f:[I

    iput-boolean p1, v0, La/b/h/x;->b:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public k(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, La/b/h/u;->h:La/b/h/s0;

    if-nez v0, :cond_0

    new-instance v0, La/b/h/s0;

    invoke-direct {v0}, La/b/h/s0;-><init>()V

    iput-object v0, p0, La/b/h/u;->h:La/b/h/s0;

    :cond_0
    iget-object v0, p0, La/b/h/u;->h:La/b/h/s0;

    iput-object p1, v0, La/b/h/s0;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, La/b/h/s0;->d:Z

    .line 1
    iput-object v0, p0, La/b/h/u;->b:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->c:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->d:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->e:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->f:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->g:La/b/h/s0;

    return-void
.end method

.method public l(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, La/b/h/u;->h:La/b/h/s0;

    if-nez v0, :cond_0

    new-instance v0, La/b/h/s0;

    invoke-direct {v0}, La/b/h/s0;-><init>()V

    iput-object v0, p0, La/b/h/u;->h:La/b/h/s0;

    :cond_0
    iget-object v0, p0, La/b/h/u;->h:La/b/h/s0;

    iput-object p1, v0, La/b/h/s0;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, La/b/h/s0;->c:Z

    .line 1
    iput-object v0, p0, La/b/h/u;->b:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->c:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->d:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->e:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->f:La/b/h/s0;

    iput-object v0, p0, La/b/h/u;->g:La/b/h/s0;

    return-void
.end method

.method public final m(Landroid/content/Context;La/b/h/u0;)V
    .locals 10

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, La/b/h/u;->j:I

    const/4 v2, 0x2

    invoke-virtual {p2, v2, v1}, La/b/h/u0;->j(II)I

    move-result v1

    iput v1, p0, La/b/h/u;->j:I

    const/16 v1, 0x1c

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-lt v0, v1, :cond_0

    const/16 v5, 0xb

    invoke-virtual {p2, v5, v3}, La/b/h/u0;->j(II)I

    move-result v5

    iput v5, p0, La/b/h/u;->k:I

    if-eq v5, v3, :cond_0

    iget v5, p0, La/b/h/u;->j:I

    and-int/2addr v5, v2

    or-int/2addr v5, v4

    iput v5, p0, La/b/h/u;->j:I

    :cond_0
    const/16 v5, 0xa

    invoke-virtual {p2, v5}, La/b/h/u0;->o(I)Z

    move-result v6

    const/16 v7, 0xc

    const/4 v8, 0x1

    if-nez v6, :cond_6

    invoke-virtual {p2, v7}, La/b/h/u0;->o(I)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2, v8}, La/b/h/u0;->o(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v4, p0, La/b/h/u;->m:Z

    invoke-virtual {p2, v8, v8}, La/b/h/u0;->j(II)I

    move-result p1

    if-eq p1, v8, :cond_4

    if-eq p1, v2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :goto_0
    iput-object p1, p0, La/b/h/u;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_1
    return-void

    :cond_6
    :goto_2
    const/4 v6, 0x0

    iput-object v6, p0, La/b/h/u;->l:Landroid/graphics/Typeface;

    invoke-virtual {p2, v7}, La/b/h/u0;->o(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move v5, v7

    :cond_7
    iget v6, p0, La/b/h/u;->k:I

    iget v7, p0, La/b/h/u;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, La/b/h/u;->a:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, La/b/h/u$a;

    invoke-direct {v9, p0, v6, v7, p1}, La/b/h/u$a;-><init>(La/b/h/u;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, La/b/h/u;->j:I

    invoke-virtual {p2, v5, p1, v9}, La/b/h/u0;->i(IILa/h/c/b/h$a;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v1, :cond_9

    iget v6, p0, La/b/h/u;->k:I

    if-eq v6, v3, :cond_9

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v6, p0, La/b/h/u;->k:I

    iget v7, p0, La/b/h/u;->j:I

    and-int/2addr v7, v2

    if-eqz v7, :cond_8

    move v7, v8

    goto :goto_3

    :cond_8
    move v7, v4

    :goto_3
    invoke-static {p1, v6, v7}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_9
    iput-object p1, p0, La/b/h/u;->l:Landroid/graphics/Typeface;

    :cond_a
    iget-object p1, p0, La/b/h/u;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v8

    goto :goto_4

    :cond_b
    move p1, v4

    :goto_4
    iput-boolean p1, p0, La/b/h/u;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, La/b/h/u;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v5}, La/b/h/u0;->m(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    if-lt v0, v1, :cond_e

    iget p2, p0, La/b/h/u;->k:I

    if-eq p2, v3, :cond_e

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, La/b/h/u;->k:I

    iget v0, p0, La/b/h/u;->j:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_d

    move v4, v8

    :cond_d
    invoke-static {p1, p2, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_5

    :cond_e
    iget p2, p0, La/b/h/u;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_5
    iput-object p1, p0, La/b/h/u;->l:Landroid/graphics/Typeface;

    :cond_f
    return-void
.end method
