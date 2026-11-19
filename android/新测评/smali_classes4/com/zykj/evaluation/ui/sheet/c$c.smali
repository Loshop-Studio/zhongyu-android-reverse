.class public final Lcom/zykj/evaluation/ui/sheet/c$c;
.super Lcom/zykj/evaluation/ui/sheet/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/sheet/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final d:Lcom/zykj/evaluation/ui/sheet/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/sheet/c$c;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/sheet/c$c;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/sheet/c$c;->d:Lcom/zykj/evaluation/ui/sheet/c$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const-wide v0, 0xff555555L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v3

    .line 10
    const-wide v0, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    const-wide v0, 0xffccccccL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    const/4 v9, 0x0

    .line 29
    move-object v2, p0

    .line 30
    invoke-direct/range {v2 .. v9}, Lcom/zykj/evaluation/ui/sheet/c;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/evaluation/ui/sheet/c$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x554a6e30

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Todo"

    return-object v0
.end method
