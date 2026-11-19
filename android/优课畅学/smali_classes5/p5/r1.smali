.class public final synthetic Lp5/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/r1;->a:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/r1;->a:Lx7/l;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lp5/w1;->b(Lx7/l;Ljava/lang/String;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
