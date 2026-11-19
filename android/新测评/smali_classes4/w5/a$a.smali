.class public final Lw5/a$a;
.super Lw5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final c:Lw5/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw5/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lw5/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw5/a$a;->c:Lw5/a$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const-wide v0, 0xffffffffL

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
    const-wide v0, 0xff4797f3L

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
    const/4 v7, 0x0

    .line 20
    move-object v2, p0

    .line 21
    invoke-direct/range {v2 .. v7}, Lw5/a;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
