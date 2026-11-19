.class public final synthetic Lw/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lk/j;


# direct methods
.method public synthetic constructor <init>(Lk/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/f;->c:Lk/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/f;->c:Lk/j;

    check-cast p1, Lw/g;

    invoke-static {v0, p1}, Lw/g$a;->a(Lk/j;Lw/g;)Lk/j;

    move-result-object p1

    return-object p1
.end method
