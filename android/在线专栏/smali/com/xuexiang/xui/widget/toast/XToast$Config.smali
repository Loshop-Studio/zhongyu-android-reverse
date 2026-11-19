.class public Lcom/xuexiang/xui/widget/toast/XToast$Config;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/toast/XToast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Config"
.end annotation


# static fields
.field private static final LOADED_TOAST_TYPEFACE:Landroid/graphics/Typeface;

.field private static volatile sInstance:Lcom/xuexiang/xui/widget/toast/XToast$Config;


# instance fields
.field private allowQueue:Z

.field private alpha:I

.field private gravity:I

.field private textSize:I

.field private tintIcon:Z

.field private typeface:Landroid/graphics/Typeface;

.field private xOffset:I

.field private yOffset:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "sans-serif-condensed"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->LOADED_TOAST_TYPEFACE:Landroid/graphics/Typeface;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->LOADED_TOAST_TYPEFACE:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->typeface:Landroid/graphics/Typeface;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->textSize:I

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->tintIcon:Z

    .line 5
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->allowQueue:Z

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->alpha:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->gravity:I

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->xOffset:I

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->yOffset:I

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/toast/XToast$Config;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->tintIcon:Z

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/toast/XToast$Config;)Landroid/graphics/Typeface;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->typeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/toast/XToast$Config;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->textSize:I

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/toast/XToast$Config;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->alpha:I

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/toast/XToast$Config;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->allowQueue:Z

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/toast/XToast$Config;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->gravity:I

    return p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/toast/XToast$Config;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->xOffset:I

    return p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/toast/XToast$Config;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->yOffset:I

    return p0
.end method

.method public static get()Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->sInstance:Lcom/xuexiang/xui/widget/toast/XToast$Config;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/xuexiang/xui/widget/toast/XToast$Config;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/xuexiang/xui/widget/toast/XToast$Config;->sInstance:Lcom/xuexiang/xui/widget/toast/XToast$Config;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/xuexiang/xui/widget/toast/XToast$Config;

    invoke-direct {v1}, Lcom/xuexiang/xui/widget/toast/XToast$Config;-><init>()V

    sput-object v1, Lcom/xuexiang/xui/widget/toast/XToast$Config;->sInstance:Lcom/xuexiang/xui/widget/toast/XToast$Config;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->sInstance:Lcom/xuexiang/xui/widget/toast/XToast$Config;

    return-object v0
.end method


# virtual methods
.method public allowQueue(Z)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->allowQueue:Z

    return-object p0
.end method

.method public reset()V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->LOADED_TOAST_TYPEFACE:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->typeface:Landroid/graphics/Typeface;

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->textSize:I

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->tintIcon:Z

    .line 4
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->allowQueue:Z

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->alpha:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->gravity:I

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->xOffset:I

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->yOffset:I

    return-void
.end method

.method public resetGravity()Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 1

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->gravity:I

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->xOffset:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->yOffset:I

    return-object p0
.end method

.method public setAlpha(I)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->alpha:I

    return-object p0
.end method

.method public setGravity(I)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->gravity:I

    return-object p0
.end method

.method public setGravity(III)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->gravity:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->xOffset:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->yOffset:I

    return-object p0
.end method

.method public setTextSize(I)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->textSize:I

    return-object p0
.end method

.method public setToastTypeface(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->typeface:Landroid/graphics/Typeface;

    :cond_0
    return-object p0
.end method

.method public setXOffset(I)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->xOffset:I

    return-object p0
.end method

.method public setYOffset(I)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->yOffset:I

    return-object p0
.end method

.method public tintIcon(Z)Lcom/xuexiang/xui/widget/toast/XToast$Config;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/toast/XToast$Config;->tintIcon:Z

    return-object p0
.end method
