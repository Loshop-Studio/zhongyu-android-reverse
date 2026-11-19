.class public final synthetic Lj4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj4/k;


# direct methods
.method public synthetic constructor <init>(Lj4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/i;->a:Lj4/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj4/i;->a:Lj4/k;

    invoke-static {v0}, Lj4/k;->b(Lj4/k;)V

    return-void
.end method
