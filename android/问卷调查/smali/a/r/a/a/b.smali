.class public La/r/a/a/b;
.super La/r/a/a/e;
.source ""

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/r/a/a/b$b;,
        La/r/a/a/b$c;
    }
.end annotation


# instance fields
.field public c:La/r/a/a/b$b;

.field public d:Landroid/content/Context;

.field public e:Landroid/animation/ArgbEvaluator;

.field public final f:Landroid/graphics/drawable/Drawable$Callback;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, v0}, La/r/a/a/b;-><init>(Landroid/content/Context;La/r/a/a/b$b;Landroid/content/res/Resources;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/r/a/a/b$b;Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, La/r/a/a/e;-><init>()V

    const/4 p2, 0x0

    iput-object p2, p0, La/r/a/a/b;->e:Landroid/animation/ArgbEvaluator;

    new-instance p3, La/r/a/a/b$a;

    invoke-direct {p3, p0}, La/r/a/a/b$a;-><init>(La/r/a/a/b;)V

    iput-object p3, p0, La/r/a/a/b;->f:Landroid/graphics/drawable/Drawable$Callback;

    iput-object p1, p0, La/r/a/a/b;->d:Landroid/content/Context;

    new-instance p1, La/r/a/a/b$b;

    invoke-direct {p1, p2, p3, p2}, La/r/a/a/b$b;-><init>(La/r/a/a/b$b;Landroid/graphics/drawable/Drawable$Callback;Landroid/content/res/Resources;)V

    iput-object p1, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    return-void
.end method


# virtual methods
.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    :cond_0
    return-void
.end method

.method public canApplyTheme()Z
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1}, La/r/a/a/f;->draw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object p1, p1, La/r/a/a/b$b;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public getAlpha()I
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0}, La/r/a/a/f;->getAlpha()I

    move-result v0

    return v0
.end method

.method public getChangingConfigurations()I
    .locals 2

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget v1, v1, La/r/a/a/b$b;->a:I

    or-int/2addr v0, v1

    return v0
.end method

.method public getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0}, La/r/a/a/f;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    new-instance v0, La/r/a/a/b$c;

    iget-object v1, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-direct {v0, v1}, La/r/a/a/b$c;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0}, La/r/a/a/f;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0}, La/r/a/a/f;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0}, La/r/a/a/f;->getOpacity()I

    move-result v0

    return v0
.end method

.method public inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, La/r/a/a/b;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v0, v1, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    move-object/from16 v6, p2

    .line 1
    invoke-virtual {v0, v2, v6, v3, v4}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void

    :cond_0
    move-object/from16 v6, p2

    .line 2
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    :goto_0
    if-eq v0, v8, :cond_e

    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v9

    if-ge v9, v7, :cond_1

    const/4 v9, 0x3

    if-eq v0, v9, :cond_e

    :cond_1
    const/4 v9, 0x2

    if-ne v0, v9, :cond_d

    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v10, "animated-vector"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v10, :cond_7

    sget-object v0, La/r/a/a/a;->e:[I

    invoke-static {v2, v4, v3, v0}, La/h/b/e;->F(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v10

    invoke-virtual {v10, v13, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_6

    .line 3
    sget-object v14, La/r/a/a/f;->k:Landroid/graphics/PorterDuff$Mode;

    if-lt v5, v11, :cond_2

    new-instance v9, La/r/a/a/f;

    invoke-direct {v9}, La/r/a/a/f;-><init>()V

    .line 4
    sget-object v11, La/h/c/b/h;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v2, v0, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 5
    iput-object v0, v9, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    new-instance v0, La/r/a/a/f$i;

    iget-object v11, v9, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v11

    invoke-direct {v0, v11}, La/r/a/a/f$i;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    goto :goto_3

    :cond_2
    :try_start_0
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v0

    invoke-static {v0}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v11

    :goto_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v14

    if-eq v14, v9, :cond_3

    if-eq v14, v8, :cond_3

    goto :goto_1

    :cond_3
    if-ne v14, v9, :cond_4

    invoke-static {v2, v0, v11, v4}, La/r/a/a/f;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)La/r/a/a/f;

    move-result-object v9

    goto :goto_3

    :cond_4
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v9, "No start tag found"

    invoke-direct {v0, v9}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    :goto_2
    const-string v9, "VectorDrawableCompat"

    const-string v11, "parser error"

    invoke-static {v9, v11, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v9, v12

    .line 6
    :goto_3
    iput-boolean v13, v9, La/r/a/a/f;->g:Z

    .line 7
    iget-object v0, v1, La/r/a/a/b;->f:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {v9, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object v0, v1, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    if-eqz v0, :cond_5

    invoke-virtual {v0, v12}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_5
    iget-object v0, v1, La/r/a/a/b;->c:La/r/a/a/b$b;

    iput-object v9, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    :cond_6
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_a

    :cond_7
    const-string v9, "target"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v0, La/r/a/a/a;->f:[I

    invoke-virtual {v2, v3, v0}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v8, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    if-eqz v10, :cond_c

    iget-object v13, v1, La/r/a/a/b;->d:Landroid/content/Context;

    if-eqz v13, :cond_b

    if-lt v5, v11, :cond_8

    .line 8
    invoke-static {v13, v10}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v10

    goto :goto_4

    :cond_8
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v13}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v15

    const-string v11, "Can\'t load animation resource ID #0x"

    .line 9
    :try_start_1
    invoke-virtual {v14, v10}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;

    move-result-object v21
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    :try_start_2
    invoke-static/range {v21 .. v21}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/high16 v20, 0x3f800000    # 1.0f

    move-object/from16 v16, v21

    invoke-static/range {v13 .. v20}, La/r/a/a/c;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;

    move-result-object v10
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 11
    invoke-interface/range {v21 .. v21}, Landroid/content/res/XmlResourceParser;->close()V

    .line 12
    :goto_4
    iget-object v11, v1, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v11, v11, La/r/a/a/b$b;->b:La/r/a/a/f;

    .line 13
    iget-object v11, v11, La/r/a/a/f;->c:La/r/a/a/f$h;

    iget-object v11, v11, La/r/a/a/f$h;->b:La/r/a/a/f$g;

    iget-object v11, v11, La/r/a/a/f$g;->p:La/e/a;

    .line 14
    invoke-virtual {v11, v9, v12}, La/e/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .line 15
    invoke-virtual {v10, v11}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    iget-object v11, v1, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v12, v11, La/r/a/a/b$b;->d:Ljava/util/ArrayList;

    if-nez v12, :cond_9

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v11, La/r/a/a/b$b;->d:Ljava/util/ArrayList;

    iget-object v11, v1, La/r/a/a/b;->c:La/r/a/a/b$b;

    new-instance v12, La/e/a;

    invoke-direct {v12}, La/e/a;-><init>()V

    iput-object v12, v11, La/r/a/a/b$b;->e:La/e/a;

    :cond_9
    iget-object v11, v1, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v11, v11, La/r/a/a/b$b;->d:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v11, v1, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v11, v11, La/r/a/a/b$b;->e:La/e/a;

    invoke-virtual {v11, v10, v9}, La/e/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_8

    :catch_2
    move-exception v0

    move-object/from16 v12, v21

    goto :goto_5

    :catch_3
    move-exception v0

    move-object/from16 v12, v21

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :catch_4
    move-exception v0

    .line 16
    :goto_5
    :try_start_3
    new-instance v2, Landroid/content/res/Resources$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v2

    :catch_5
    move-exception v0

    :goto_6
    new-instance v2, Landroid/content/res/Resources$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_7
    move-object/from16 v21, v12

    :goto_8
    if-eqz v21, :cond_a

    invoke-interface/range {v21 .. v21}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_a
    throw v0

    .line 17
    :cond_b
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Context can\'t be null when inflating animators"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_9
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_d
    :goto_a
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    goto/16 :goto_0

    :cond_e
    iget-object v0, v1, La/r/a/a/b;->c:La/r/a/a/b$b;

    .line 18
    iget-object v2, v0, La/r/a/a/b$b;->c:Landroid/animation/AnimatorSet;

    if-nez v2, :cond_f

    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v2, v0, La/r/a/a/b$b;->c:Landroid/animation/AnimatorSet;

    :cond_f
    iget-object v2, v0, La/r/a/a/b$b;->c:Landroid/animation/AnimatorSet;

    iget-object v0, v0, La/r/a/a/b$b;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    return-void
.end method

.method public isAutoMirrored()Z
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result v0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0}, La/r/a/a/f;->isAutoMirrored()Z

    move-result v0

    return v0
.end method

.method public isRunning()Z
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->isRunning()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    return v0
.end method

.method public isStateful()Z
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0}, La/r/a/a/f;->isStateful()Z

    move-result v0

    return v0
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    :cond_0
    return-object p0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onLevelChange(I)Z
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1
.end method

.method public onStateChange([I)Z
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1}, La/r/a/a/e;->setState([I)Z

    move-result p1

    return p1
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1}, La/r/a/a/f;->setAlpha(I)V

    return-void
.end method

.method public setAutoMirrored(Z)V
    .locals 2

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    .line 3
    iget-object v1, v0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, v0, La/r/a/a/f;->c:La/r/a/a/f$h;

    iput-boolean p1, v0, La/r/a/a/f$h;->e:Z

    :goto_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    .line 1
    iget-object v1, v0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0

    :cond_1
    iput-object p1, v0, La/r/a/a/f;->e:Landroid/graphics/ColorFilter;

    invoke-virtual {v0}, La/r/a/a/f;->invalidateSelf()V

    :goto_0
    return-void
.end method

.method public setTint(I)V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, La/h/b/e;->M(Landroid/graphics/drawable/Drawable;I)V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1}, La/r/a/a/f;->setTint(I)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, La/h/b/e;->N(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1}, La/r/a/a/f;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, La/h/b/e;->O(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1}, La/r/a/a/f;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->b:La/r/a/a/f;

    invoke-virtual {v0, p1, p2}, La/r/a/a/f;->setVisible(ZZ)Z

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public start()V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public stop()V
    .locals 1

    iget-object v0, p0, La/r/a/a/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->stop()V

    return-void

    :cond_0
    iget-object v0, p0, La/r/a/a/b;->c:La/r/a/a/b$b;

    iget-object v0, v0, La/r/a/a/b$b;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->end()V

    return-void
.end method
