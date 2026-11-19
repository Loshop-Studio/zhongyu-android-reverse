.class public final synthetic Ls8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ls8/f;


# direct methods
.method public synthetic constructor <init>(Ls8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls8/e;->a:Ls8/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls8/e;->a:Ls8/f;

    check-cast p1, Lu8/a;

    invoke-static {v0, p1}, Ls8/f;->g(Ls8/f;Lu8/a;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
