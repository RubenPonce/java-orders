package com.titrate.orders.service;

import com.titrate.orders.model.Agents;

import java.util.ArrayList;

public interface AgentService {
    ArrayList<Agents> findAll();

    Agents findAgentsById(long id);

    Agents findAgentsByName(String name);

    void delete(long id);

    Agents save(Agents agent);

    Agents update(Agents agent, long id);
}
