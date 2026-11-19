.class public final synthetic Lce/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lce/f;


# direct methods
.method public synthetic constructor <init>(Lce/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/d;->c:Lce/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lce/d;->c:Lce/f;

    invoke-static {v0}, Lce/f;->f(Lce/f;)Lee/f;

    move-result-object v0

    return-object v0
.end method
