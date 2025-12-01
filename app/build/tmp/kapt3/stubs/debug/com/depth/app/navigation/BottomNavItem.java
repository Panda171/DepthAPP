package com.depth.app.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0003\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/depth/app/navigation/BottomNavItem;", "", "route", "", "label", "iconRes", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getIconRes", "()I", "getLabel", "()Ljava/lang/String;", "getRoute", "Add", "Companion", "Friends", "Home", "Lcom/depth/app/navigation/BottomNavItem$Add;", "Lcom/depth/app/navigation/BottomNavItem$Friends;", "Lcom/depth/app/navigation/BottomNavItem$Home;", "app_debug"})
public abstract class BottomNavItem {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    private final int iconRes = 0;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.depth.app.navigation.BottomNavItem> items = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.depth.app.navigation.BottomNavItem.Companion Companion = null;
    
    private BottomNavItem(java.lang.String route, java.lang.String label, int iconRes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel() {
        return null;
    }
    
    public final int getIconRes() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/depth/app/navigation/BottomNavItem$Add;", "Lcom/depth/app/navigation/BottomNavItem;", "()V", "app_debug"})
    public static final class Add extends com.depth.app.navigation.BottomNavItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.depth.app.navigation.BottomNavItem.Add INSTANCE = null;
        
        private Add() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/depth/app/navigation/BottomNavItem$Companion;", "", "()V", "items", "", "Lcom/depth/app/navigation/BottomNavItem;", "getItems", "()Ljava/util/List;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.depth.app.navigation.BottomNavItem> getItems() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/depth/app/navigation/BottomNavItem$Friends;", "Lcom/depth/app/navigation/BottomNavItem;", "()V", "app_debug"})
    public static final class Friends extends com.depth.app.navigation.BottomNavItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.depth.app.navigation.BottomNavItem.Friends INSTANCE = null;
        
        private Friends() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/depth/app/navigation/BottomNavItem$Home;", "Lcom/depth/app/navigation/BottomNavItem;", "()V", "app_debug"})
    public static final class Home extends com.depth.app.navigation.BottomNavItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.depth.app.navigation.BottomNavItem.Home INSTANCE = null;
        
        private Home() {
        }
    }
}