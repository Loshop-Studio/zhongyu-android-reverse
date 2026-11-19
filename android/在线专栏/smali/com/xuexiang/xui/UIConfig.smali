.class public Lcom/xuexiang/xui/UIConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile sInstance:Lcom/xuexiang/xui/UIConfig;


# instance fields
.field private mAppIcon:Landroid/graphics/drawable/Drawable;

.field private mStateLayoutConfig:Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/UIConfig;->mStateLayoutConfig:Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    .line 3
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/xuexiang/xui/utils/Utils;->getAppIcon(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/UIConfig;->mAppIcon:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public static getInstance()Lcom/xuexiang/xui/UIConfig;
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/UIConfig;->sInstance:Lcom/xuexiang/xui/UIConfig;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/xuexiang/xui/UIConfig;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/xuexiang/xui/UIConfig;->sInstance:Lcom/xuexiang/xui/UIConfig;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/xuexiang/xui/UIConfig;

    invoke-direct {v1}, Lcom/xuexiang/xui/UIConfig;-><init>()V

    sput-object v1, Lcom/xuexiang/xui/UIConfig;->sInstance:Lcom/xuexiang/xui/UIConfig;

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
    sget-object v0, Lcom/xuexiang/xui/UIConfig;->sInstance:Lcom/xuexiang/xui/UIConfig;

    return-object v0
.end method


# virtual methods
.method public getAppIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/UIConfig;->mAppIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/UIConfig;->mStateLayoutConfig:Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    return-object v0
.end method

.method public setAppIcon(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/UIConfig;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/UIConfig;->mAppIcon:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public setStatefulLayoutConfig(Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;)Lcom/xuexiang/xui/UIConfig;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/UIConfig;->mStateLayoutConfig:Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    return-object p0
.end method
