.class public final synthetic Lw8/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lw8/r1;


# direct methods
.method public synthetic constructor <init>(Lw8/r1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/q1;->a:Lw8/r1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw8/q1;->a:Lw8/r1;

    check-cast p1, Lu8/a;

    invoke-static {v0, p1}, Lw8/r1;->a(Lw8/r1;Lu8/a;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
