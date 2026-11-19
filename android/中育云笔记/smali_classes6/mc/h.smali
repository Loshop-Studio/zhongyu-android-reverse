.class public final synthetic Lmc/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc/a;


# instance fields
.field public final synthetic a:Lmc/j;


# direct methods
.method public synthetic constructor <init>(Lmc/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc/h;->a:Lmc/j;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc/h;->a:Lmc/j;

    check-cast p1, Ljava/lang/Class;

    invoke-static {v0, p1}, Lmc/j;->e(Lmc/j;Ljava/lang/Class;)V

    return-void
.end method
