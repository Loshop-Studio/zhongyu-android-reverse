.class public final Lw5/i$a;
.super Lw5/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final c:Lw5/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw5/i$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lw5/i$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw5/i$a;->c:Lw5/i$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f120071

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const v2, 0x7f080106

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v2, v0, v1}, Lw5/i;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
