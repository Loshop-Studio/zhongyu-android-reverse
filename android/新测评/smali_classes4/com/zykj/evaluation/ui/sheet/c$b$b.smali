.class public final Lcom/zykj/evaluation/ui/sheet/c$b$b;
.super Lcom/zykj/evaluation/ui/sheet/c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/sheet/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final d:Lcom/zykj/evaluation/ui/sheet/c$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/sheet/c$b$b;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/sheet/c$b$b;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/sheet/c$b$b;->d:Lcom/zykj/evaluation/ui/sheet/c$b$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const-wide v0, 0xff48a0f8L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {p0, v0, v1, v2}, Lcom/zykj/evaluation/ui/sheet/c$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/evaluation/ui/sheet/c$b$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x3b697c29

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Normal"

    return-object v0
.end method
