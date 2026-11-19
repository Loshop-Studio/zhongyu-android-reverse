.class public final synthetic Lw8/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lw8/d2;


# direct methods
.method public synthetic constructor <init>(Lw8/d2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/b2;->a:Lw8/d2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw8/b2;->a:Lw8/d2;

    invoke-static {v0}, Lw8/d2;->j(Lw8/d2;)[Lu8/f;

    move-result-object v0

    return-object v0
.end method
