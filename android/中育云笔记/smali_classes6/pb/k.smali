.class public final synthetic Lpb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lpb/l;


# direct methods
.method public synthetic constructor <init>(Lpb/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/k;->c:Lpb/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lpb/k;->c:Lpb/l;

    invoke-static {v0}, Lpb/l;->g(Lpb/l;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
