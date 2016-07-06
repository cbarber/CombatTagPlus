package net.minelink.ctplus.event;

import java.util.UUID;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class PlayerCombatUntagEvent extends Event {
    private final UntagReason reason;
    private UUID playerId;
    private static HandlerList handlers = new HandlerList();

    public PlayerCombatUntagEvent(UUID playerId, UntagReason reason) {
        this.playerId = playerId;
        this.reason = reason;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers()
    {
        return handlers;
    }
    
    public UUID getPlayerId()
    {
        return playerId;
    }

    public UntagReason getReason()
    {
        return reason;
    }
}