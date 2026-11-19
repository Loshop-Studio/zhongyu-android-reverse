.class public abstract Lg7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ls6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld7/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ld7/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg7/a$a;->a:Ls6/f;

    .line 7
    .line 8
    return-void
.end method
