.class public interface abstract Lu/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/b$a;
    }
.end annotation


# static fields
.field public static final a:Lu/b$a;

.field public static final b:Lu/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lu/b$a;->a:Lu/b$a;

    .line 2
    .line 3
    sput-object v0, Lu/b;->a:Lu/b$a;

    .line 4
    .line 5
    new-instance v0, Lu/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lu/a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lu/b;->b:Lu/b;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    .line 1
    invoke-static {}, Lu/b;->b()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method


# virtual methods
.method public abstract c()Z
.end method
