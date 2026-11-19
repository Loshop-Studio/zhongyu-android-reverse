.class public final synthetic Lqd/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lqd/m$a;


# direct methods
.method public synthetic constructor <init>(Lqd/m$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd/l;->c:Lqd/m$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/l;->c:Lqd/m$a;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lqd/m$a;->d(Lqd/m$a;I)Lqd/i;

    move-result-object p1

    return-object p1
.end method
