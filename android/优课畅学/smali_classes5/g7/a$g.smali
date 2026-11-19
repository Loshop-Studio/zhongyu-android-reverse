.class public abstract Lg7/a$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# static fields
.field public static final a:Ls6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/reactivex/internal/schedulers/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/reactivex/internal/schedulers/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg7/a$g;->a:Ls6/f;

    .line 7
    .line 8
    return-void
.end method
