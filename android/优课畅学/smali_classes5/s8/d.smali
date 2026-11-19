.class public final synthetic Ls8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Ls8/f;


# direct methods
.method public synthetic constructor <init>(Ls8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls8/d;->a:Ls8/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls8/d;->a:Ls8/f;

    invoke-static {v0}, Ls8/f;->f(Ls8/f;)Lu8/f;

    move-result-object v0

    return-object v0
.end method
