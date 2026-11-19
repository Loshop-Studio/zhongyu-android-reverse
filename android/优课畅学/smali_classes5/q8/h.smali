.class public final Lq8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/g;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lx7/q;

.field public final c:Lx7/q;

.field public final d:Lx7/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx7/q;Lx7/q;Lx7/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq8/h;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lq8/h;->b:Lx7/q;

    .line 4
    iput-object p3, p0, Lq8/h;->c:Lx7/q;

    .line 5
    iput-object p4, p0, Lq8/h;->d:Lx7/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lx7/q;Lx7/q;Lx7/q;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lq8/h;-><init>(Ljava/lang/Object;Lx7/q;Lx7/q;Lx7/q;)V

    return-void
.end method
