.class public final Lp7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/Boolean;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lp7/c$a;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput p2, p0, Lp7/c$a;->b:I

    .line 12
    .line 13
    iput-object p3, p0, Lp7/c$a;->c:Ljava/lang/Boolean;

    .line 14
    .line 15
    return-void
.end method
