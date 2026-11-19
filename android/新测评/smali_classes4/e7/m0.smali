.class public final synthetic Le7/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le7/o0;


# direct methods
.method public synthetic constructor <init>(Le7/o0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/m0;->a:Le7/o0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/m0;->a:Le7/o0;

    invoke-static {v0}, Le7/o0;->a(Le7/o0;)V

    return-void
.end method
