.class public final Lj6/q$j;
.super Lj6/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# static fields
.field public static final e:Lj6/q$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj6/q$j;

    .line 2
    .line 3
    invoke-direct {v0}, Lj6/q$j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj6/q$j;->e:Lj6/q$j;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const-wide v0, 0xff27c69aL

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
    const v0, 0xffffff

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    const-wide v0, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v8

    .line 26
    const/4 v10, 0x0

    .line 27
    const-string v7, "\u6b63\u786e"

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    invoke-direct/range {v2 .. v10}, Lj6/q;-><init>(JJLjava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
