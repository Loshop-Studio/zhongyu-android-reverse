.class public Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mEffectName:Ljava/lang/String;

.field private mParametersMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;->mParametersMap:Ljava/util/Map;

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;->mEffectName:Ljava/lang/String;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Effect name cannot be empty.Please provide effect name from EffectFactory"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;->mEffectName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;->mParametersMap:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;
    .locals 2

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$1;)V

    return-object v0
.end method

.method public setParameter(Ljava/lang/String;Ljava/lang/Object;)Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect$Builder;->mParametersMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
