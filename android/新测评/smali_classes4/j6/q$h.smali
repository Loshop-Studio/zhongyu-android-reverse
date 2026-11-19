.class public final Lj6/q$h;
.super Lj6/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# static fields
.field public static final e:Lj6/q$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj6/q$h;

    .line 2
    .line 3
    invoke-direct {v0}, Lj6/q$h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj6/q$h;->e:Lj6/q$h;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 11

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
    const-wide v0, 0xffdcdee0L

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
    const-wide v0, 0xff646566L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v8

    .line 28
    const/4 v10, 0x0

    .line 29
    const-string v7, "\u672a\u4f5c\u7b54"

    .line 30
    .line 31
    move-object v2, p0

    .line 32
    invoke-direct/range {v2 .. v10}, Lj6/q;-><init>(JJLjava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
