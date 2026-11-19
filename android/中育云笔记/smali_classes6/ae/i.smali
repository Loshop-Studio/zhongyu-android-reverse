.class public final Lae/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/h;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lhd/q;

.field public final c:Lhd/q;

.field public final d:Lhd/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lhd/q;Lhd/q;Lhd/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lae/i;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lae/i;->b:Lhd/q;

    .line 4
    iput-object p3, p0, Lae/i;->c:Lhd/q;

    .line 5
    iput-object p4, p0, Lae/i;->d:Lhd/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lhd/q;Lhd/q;Lhd/q;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lae/i;-><init>(Ljava/lang/Object;Lhd/q;Lhd/q;Lhd/q;)V

    return-void
.end method
