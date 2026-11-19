.class Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# static fields
.field private static final TAG:Ljava/lang/String; = "ImageFilterView"


# instance fields
.field private isSaveImage:Z

.field private mCurrentEffect:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

.field private mCustomEffect:Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;

.field private mEffect:Landroid/media/effect/Effect;

.field private mEffectContext:Landroid/media/effect/EffectContext;

.field private mImageHeight:I

.field private mImageWidth:I

.field private mInitialized:Z

.field private mOnBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

.field private mSourceBitmap:Landroid/graphics/Bitmap;

.field private mTexRenderer:Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

.field private mTextures:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTextures:[I

    .line 3
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTexRenderer:Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mInitialized:Z

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->isSaveImage:Z

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 8
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTextures:[I

    .line 9
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTexRenderer:Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mInitialized:Z

    .line 11
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->isSaveImage:Z

    .line 12
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;)Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mOnBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    return-object p0
.end method

.method private applyEffect()V
    .locals 6

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTextures:[I

    const/4 v2, 0x0

    aget v2, v1, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mImageWidth:I

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mImageHeight:I

    const/4 v5, 0x1

    aget v1, v1, v5

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/media/effect/Effect;->apply(IIII)V

    return-void
.end method

.method private init()V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 2
    invoke-virtual {p0, p0}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 4
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->NONE:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V

    return-void
.end method

.method private initEffect()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffectContext:Landroid/media/effect/EffectContext;

    invoke-virtual {v0}, Landroid/media/effect/EffectContext;->getFactory()Landroid/media/effect/EffectFactory;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroid/media/effect/Effect;->release()V

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCustomEffect:Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;->getEffectName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCustomEffect:Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;->getParameters()Ljava/util/Map;

    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_1
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView$2;->$SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter:[I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCurrentEffect:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const-string v2, "android.media.effect.effects.FlipEffect"

    const-string v3, "strength"

    const/high16 v4, 0x3f000000    # 0.5f

    const-string v5, "scale"

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_1

    :pswitch_1
    const-string v1, "android.media.effect.effects.VignetteEffect"

    .line 10
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    .line 11
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_2
    const-string v1, "android.media.effect.effects.TintEffect"

    .line 12
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const v1, -0xff01

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "tint"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_3
    const-string v1, "android.media.effect.effects.ColorTemperatureEffect"

    .line 14
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const v1, 0x3f666666    # 0.9f

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_4
    const-string v1, "android.media.effect.effects.SharpenEffect"

    .line 16
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    goto/16 :goto_1

    :pswitch_5
    const-string v1, "android.media.effect.effects.SepiaEffect"

    .line 17
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    goto/16 :goto_1

    :pswitch_6
    const-string v1, "android.media.effect.effects.SaturateEffect"

    .line 18
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    .line 19
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_7
    const-string v1, "android.media.effect.effects.RotateEffect"

    .line 20
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const/16 v1, 0xb4

    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "angle"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_8
    const-string v1, "android.media.effect.effects.PosterizeEffect"

    .line 22
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    goto/16 :goto_1

    :pswitch_9
    const-string v1, "android.media.effect.effects.NegativeEffect"

    .line 23
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    goto/16 :goto_1

    :pswitch_a
    const-string v1, "android.media.effect.effects.LomoishEffect"

    .line 24
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    goto/16 :goto_1

    :pswitch_b
    const-string v1, "android.media.effect.effects.GrayscaleEffect"

    .line 25
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    goto/16 :goto_1

    :pswitch_c
    const-string v1, "android.media.effect.effects.GrainEffect"

    .line 26
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 27
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 28
    :pswitch_d
    invoke-virtual {v0, v2}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    .line 29
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "vertical"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 30
    :pswitch_e
    invoke-virtual {v0, v2}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    .line 31
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "horizontal"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_f
    const-string v1, "android.media.effect.effects.FisheyeEffect"

    .line 32
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    .line 33
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_10
    const-string v1, "android.media.effect.effects.FillLightEffect"

    .line 34
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const v1, 0x3f4ccccd    # 0.8f

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_11
    const-string v1, "android.media.effect.effects.DuotoneEffect"

    .line 36
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const/16 v1, -0x100

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "first_color"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const v1, -0xbbbbbc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "second_color"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_12
    const-string v1, "android.media.effect.effects.DocumentaryEffect"

    .line 39
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    goto :goto_1

    :pswitch_13
    const-string v1, "android.media.effect.effects.CrossProcessEffect"

    .line 40
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    goto :goto_1

    :pswitch_14
    const-string v1, "android.media.effect.effects.ContrastEffect"

    .line 41
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const v1, 0x3fb33333    # 1.4f

    .line 42
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "contrast"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_15
    const-string v1, "android.media.effect.effects.BrightnessEffect"

    .line 43
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const/high16 v1, 0x40000000    # 2.0f

    .line 44
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "brightness"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_16
    const-string v1, "android.media.effect.effects.BlackWhiteEffect"

    .line 45
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const v1, 0x3dcccccd    # 0.1f

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "black"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    const v1, 0x3f333333    # 0.7f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "white"

    invoke-virtual {v0, v2, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_17
    const-string v1, "android.media.effect.effects.AutoFixEffect"

    .line 48
    invoke-virtual {v0, v1}, Landroid/media/effect/EffectFactory;->createEffect(Ljava/lang/String;)Landroid/media/effect/Effect;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffect:Landroid/media/effect/Effect;

    .line 49
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/media/effect/Effect;->setParameter(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private loadTextures()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTextures:[I

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mSourceBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mImageWidth:I

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mSourceBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mImageHeight:I

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTexRenderer:Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mImageWidth:I

    invoke-virtual {v1, v3, v0}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->updateTextureSize(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTextures:[I

    aget v0, v0, v2

    const/16 v1, 0xde1

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mSourceBitmap:Landroid/graphics/Bitmap;

    invoke-static {v1, v2, v0, v2}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    .line 8
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/edit/GLToolbox;->initTexParams()V

    :cond_0
    return-void
.end method

.method private renderResult()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCurrentEffect:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->NONE:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCustomEffect:Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTexRenderer:Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTextures:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->renderTexture(I)V

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTexRenderer:Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTextures:[I

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->renderTexture(I)V

    :goto_1
    return-void
.end method


# virtual methods
.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mInitialized:Z

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/media/effect/EffectContext;->createWithCurrentGlContext()Landroid/media/effect/EffectContext;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mEffectContext:Landroid/media/effect/EffectContext;

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTexRenderer:Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->init()V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->loadTextures()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mInitialized:Z

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCurrentEffect:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->NONE:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCustomEffect:Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;

    if-eqz v0, :cond_2

    .line 7
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->initEffect()V

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->applyEffect()V

    .line 9
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->renderResult()V

    .line 10
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->isSaveImage:Z

    if-eqz v0, :cond_3

    .line 11
    invoke-static {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BitmapUtil;->createBitmapFromGLSurface(Landroid/opengl/GLSurfaceView;Ljavax/microedition/khronos/opengles/GL10;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDrawFrame: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ImageFilterView"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->isSaveImage:Z

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mOnBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    if-eqz v0, :cond_3

    .line 15
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView$1;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView$1;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mTexRenderer:Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/edit/TextureRenderer;->updateViewSize(II)V

    :cond_0
    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    return-void
.end method

.method saveBitmap(Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mOnBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->isSaveImage:Z

    .line 3
    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    return-void
.end method

.method setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCustomEffect:Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;

    .line 5
    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    return-void
.end method

.method setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCurrentEffect:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mCustomEffect:Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;

    .line 3
    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    return-void
.end method

.method setSourceBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mSourceBitmap:Landroid/graphics/Bitmap;

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->mInitialized:Z

    return-void
.end method
