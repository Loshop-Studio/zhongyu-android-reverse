.class public final synthetic Lu5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lu5/l;


# direct methods
.method public synthetic constructor <init>(Lu5/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu5/k;->a:Lu5/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/k;->a:Lu5/l;

    invoke-static {v0}, Lu5/l;->g(Lu5/l;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
