.class public Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# static fields
.field public static final DEFAULT_SHADOW_COLOR:I


# instance fields
.field private mBgColor:[I

.field private mOffsetX:I

.field private mOffsetY:I

.field private mShadowColor:I

.field private mShadowRadius:I

.field private mShape:I

.field private mShapeRadius:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "#4d000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->DEFAULT_SHADOW_COLOR:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShape:I

    const/16 v1, 0xa

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShapeRadius:I

    .line 4
    sget v1, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->DEFAULT_SHADOW_COLOR:I

    iput v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShadowColor:I

    const/16 v1, 0x10

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShadowRadius:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mOffsetX:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mOffsetY:I

    const/4 v1, 0x1

    new-array v1, v1, [I

    .line 8
    iput-object v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mBgColor:[I

    aput v0, v1, v0

    return-void
.end method


# virtual methods
.method public build()Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;
    .locals 10

    new-instance v9, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShape:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mBgColor:[I

    iget v3, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShapeRadius:I

    iget v4, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShadowColor:I

    iget v5, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShadowRadius:I

    iget v6, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mOffsetX:I

    iget v7, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mOffsetY:I

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;-><init>(I[IIIIIILcom/xuexiang/xui/widget/shadow/ShadowDrawable$1;)V

    return-object v9
.end method

.method public setBgColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mBgColor:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-object p0
.end method

.method public setBgColor([I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mBgColor:[I

    return-object p0
.end method

.method public setOffsetX(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mOffsetX:I

    return-object p0
.end method

.method public setOffsetY(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mOffsetY:I

    return-object p0
.end method

.method public setShadowColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShadowColor:I

    return-object p0
.end method

.method public setShadowRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShadowRadius:I

    return-object p0
.end method

.method public setShape(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShape:I

    return-object p0
.end method

.method public setShapeRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->mShapeRadius:I

    return-object p0
.end method
