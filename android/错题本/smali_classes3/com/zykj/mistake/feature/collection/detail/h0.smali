.class public final Lcom/zykj/mistake/feature/collection/detail/h0;
.super Lcom/zykj/mistake/feature/collection/detail/y0;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/mistake/feature/collection/detail/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/h0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/collection/detail/h0;->a:Lcom/zykj/mistake/feature/collection/detail/h0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/mistake/feature/collection/detail/h0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x687a3610

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Refresh"

    return-object v0
.end method
